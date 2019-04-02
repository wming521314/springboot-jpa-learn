package com.legend.springbootjpademo;

import com.alibaba.fastjson.JSON;
import com.legend.springbootjpademo.dao.UserDao;
import com.legend.springbootjpademo.enumeration.EnumRecordStatus;
import com.legend.springbootjpademo.vo.res.ResUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJpaDemoApplicationTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test() {

        /*List<User> userList = userDao.findByRoleIdAndRecordStatus(1L, EnumRecordStatus.exist.getIndex());
        System.out.println(userList);*/

        /*List<Object> userList = userDao.findByRoleIdAndRecordStatusNative(1L, EnumRecordStatus.exist.getIndex());
        List<ResUser> resUserList = new LinkedList<>();
        for (Object o : userList) {
            Object[] rowArray = (Object[]) o;
            Long id = Long.valueOf(rowArray[0].toString());
            Long roleId = Long.valueOf(rowArray[1].toString());
            String name = (String) rowArray[2];
            Integer sex = Integer.valueOf(rowArray[3].toString());
            Integer age = (Integer) rowArray[4];
            String comment = (String) rowArray[5];
            ResUser resUser = new ResUser(id, roleId, name, sex, age, comment);
            resUserList.add(resUser);
        }
        System.out.println(JSON.toJSONString(resUserList));*/

        /*DtoUserRole userRole = userDao.getUserRole(1L);
        System.out.println(JSON.toJSONString(userRole));*/

        /*DtoUserRole userRole = userDao.getUserRole(1L);
        System.out.println(JSON.toJSONString(userRole));*/

    }

}
