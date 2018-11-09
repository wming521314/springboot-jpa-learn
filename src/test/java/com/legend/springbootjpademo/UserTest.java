package com.legend.springbootjpademo;

import com.legend.springbootjpademo.dao.UserDao;
import com.legend.springbootjpademo.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Before
    public void before() {
        User user = new User();
        user.setId(1L);
        user.setName("风清扬");
        user.setAccount("fengqy");
        user.setPwd("123456");
        userDao.save(user);
        user = new User();
        user.setId(3L);
        user.setName("东方不败");
        user.setAccount("bubai");
        user.setPwd("123456");
        userDao.save(user);
        user.setId(5L);
        user.setName("向问天");
        user.setAccount("wentian");
        user.setPwd("123456");
        userDao.save(user);
    }

    @Test
    public void testAdd() {
        User user = new User();
        user.setId(2L);
        user.setName("任我行");
        user.setAccount("renwox");
        user.setPwd("123456");
        userDao.save(user);
        user = new User();
        user.setId(4L);
        user.setName("令狐冲");
        user.setAccount("linghuc");
        user.setPwd("123456");
        userDao.save(user);
    }

    @Test
    public void testLocate() {
        Optional<User> userDOOptional = userDao.findById(1L);
        if (userDOOptional.isPresent()) {
            User user = userDOOptional.get();
            System.out.println("name = " + user.getName());
            System.out.println("account = " + user.getAccount());
        }
    }

    @Test
    public void testFindByAccount() {
        User user = userDao.findByAccount("wentian");
        if (user != null) {
            System.out.println("name = " + user.getName());
            System.out.println("account = " + user.getAccount());
        }
    }


    @Test
    public void testFindUsersByRole() {
        List<User> userList = userDao.findUsersByRole(1L);
        for (User user : userList) {
            System.out.println("name = " + user.getName());
            System.out.println("account = " + user.getAccount());
        }
    }
    @Test
    public void testFindIdGreater() {
        List<User> userList = userDao.findByIdGreaterThan(2L);
        for (User user : userList) {
            System.out.println("name = " + user.getName());
            System.out.println("account = " + user.getAccount());
        }
    }
    @Test
    public void testFindAll() {
        List<User> userList = userDao.findAll(new Sort(Sort.Direction.DESC, "account"));
        for (User user : userList) {
            System.out.println("name = " + user.getName());
            System.out.println("account = " + user.getAccount());
        }
    }

}
