package com.baizhi.test;

import com.baizhi.dao.StudentDao;
import com.baizhi.dao.UserDao;

import com.baizhi.entity.Student;
import com.baizhi.entity.User;
import com.baizhi.service.impl.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStu {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentDao studentDao;

   @Autowired
   private UserDao userDao;

    @Test
    public void insert(){
        User user=new User();
        user.setId(3);
        userDao.insert(user);
    }
    @Test
    public void test1(){
        User user=new User();
        user.setId(3);
       user.setUsername("wwwwwwwww");
        int i = userDao.updateByPrimaryKey(user);
        System.out.println(i);
    }
    @Test
    public void test2(){
        List<User> list = userDao.selectAll();
        for (User user : list) {
            System.out.println(user);
        }

    }


}
