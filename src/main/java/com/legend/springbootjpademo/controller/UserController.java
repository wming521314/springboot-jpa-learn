package com.legend.springbootjpademo.controller;

import com.legend.springbootjpademo.dao.AuthDao;
import com.legend.springbootjpademo.dao.RoleDao;
import com.legend.springbootjpademo.dao.UserDao;
import com.legend.springbootjpademo.domain.Auth;
import com.legend.springbootjpademo.domain.Role;
import com.legend.springbootjpademo.domain.User;
import com.legend.springbootjpademo.enumeration.EnumErrorCode;
import com.legend.springbootjpademo.utils.Result;
import com.legend.springbootjpademo.vo.req.ReqGetUserInfo;
import com.legend.springbootjpademo.vo.req.ReqPage;
import com.legend.springbootjpademo.vo.res.ResAuth;
import com.legend.springbootjpademo.vo.res.ResUser;
import com.legend.springbootjpademo.vo.res.ResUserInfo;
import com.legend.springbootjpademo.vo.res.ResUserPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * @Title UserController
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2018/11/8 12:01
 */

@RestController
@RequestMapping(value="/api/User")
@Api("用户相关API")
@ControllerAdvice
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private AuthDao authDao;

    @ResponseBody
    @PostMapping("/GetAllUser")
    @ApiOperation("获取所有用户")
    public Result<List<ResUser>> getAllUser(){
        List<User> userList = userDao.findAll();
        List<ResUser> resUserList = getResUserList(userList);
        return new Result().ok(resUserList);
    }

    @PostMapping("/GetUserByPage")
    @ResponseBody
    @ApiOperation("获取用户分页列表")
    public Result<List<ResUser>> getUserByPage(@RequestBody @Valid ReqPage params, BindingResult result){
        if(result.hasErrors()){
            for (ObjectError error : result.getAllErrors()) {
                return Result.error(EnumErrorCode.parameterError.getIndex(), error.getDefaultMessage());
            }
        }

        ResUserPage resUserPage = new ResUserPage();
        Integer pageIndex = params.getPageIndex();
        Integer pageSize = params.getPageSize();
        Sort sort = new Sort(Sort.Direction.DESC, "updateTime");
        Pageable pageable = new PageRequest(pageIndex, pageSize, sort);
        Page<User> userPage = userDao.findAll(pageable);
        resUserPage.setPageIndex(pageIndex);
        resUserPage.setPageSize(pageSize);
        resUserPage.setTotalPage(userPage.getTotalPages());
        resUserPage.setTotalCount(userPage.getTotalElements());
        if (pageIndex < userPage.getTotalPages()) {
            resUserPage.setHasMoreData(true);
        } else {
            resUserPage.setHasMoreData(false);
        }
        List<User> userList = userPage.getContent();
        List<ResUser> resUserList = getResUserList(userList);
        resUserPage.setDataList(resUserList);
        return new Result().ok(resUserPage);
    }

    @ResponseBody
    @PostMapping("/GetUserInfo")
    @ApiOperation("获取用户详细信息")
    public Result<ResUserInfo> getUserInfo(@RequestBody @Valid ReqGetUserInfo params, BindingResult result){
        if(result.hasErrors()){
            for (ObjectError error : result.getAllErrors()) {
                return Result.error(EnumErrorCode.parameterError.getIndex(), error.getDefaultMessage());
            }
        }
        Long userId = params.getUserId();
        ResUserInfo resUserInfo = new ResUserInfo();
        Optional<User> userOptional = userDao.findById(userId);
        /*User user = null;
        if (userOptional.isPresent()) {
            user = userOptional.get();
        }*/
        User user = userDao.findById(userId).get();
        Long roleId = user.getRoleId();
        Role role = roleDao.findById(roleId).get();
        resUserInfo.setId(user.getId());
        resUserInfo.setName(user.getName());
        resUserInfo.setAge(user.getAge());
        resUserInfo.setComment(user.getComment());
        resUserInfo.setRoleId(user.getRoleId());
        resUserInfo.setRoleName(role.getRoleName());

        List<Long> authIdList = (List<Long>) JSONArray.toList(JSONArray.fromObject(role.getAuthIdList()), Long.class);
        List<ResAuth> resAuthList = new LinkedList<>();
        for (Long authId : authIdList) {
            Auth auth = authDao.findById(authId).get();
            ResAuth resAuth = new ResAuth(authId, auth.getDescription());
            resAuthList.add(resAuth);
        }
        resUserInfo.setAuthList(resAuthList);
        return new Result().ok(resUserInfo);
    }

    private List<ResUser> getResUserList (List<User> userList) {
        List<ResUser> resUserList = new LinkedList<>();
        for (User user : userList) {
            ResUser resUser = new ResUser();
            resUser.setId(user.getId());
            resUser.setName(user.getName());
            resUser.setSex(user.getSex());
            resUser.setAge(user.getAge());
            resUser.setComment(user.getComment());
            resUserList.add(resUser);
        }
        return resUserList;
    }

    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String test(){
        return "Hello World !";
    }

}
