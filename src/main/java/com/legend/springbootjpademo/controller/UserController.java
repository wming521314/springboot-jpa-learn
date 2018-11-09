package com.legend.springbootjpademo.controller;

import com.legend.springbootjpademo.dao.UserDao;
import com.legend.springbootjpademo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @Title UserController
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2018/11/8 12:01
 */

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="/list",method= RequestMethod.GET)
    public List<User> list(){
        return userDao.findAll();
    }

    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String test(){
        return "Hello World !";
    }

}
