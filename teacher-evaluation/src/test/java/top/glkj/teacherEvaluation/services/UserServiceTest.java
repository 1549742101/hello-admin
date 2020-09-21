package top.glkj.teacherEvaluation.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/21 10:03
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void getUerByName() {
        userService.getUerByName("");
    }

    @Test
    public void getAllUser() {
        System.out.println(userService.getAllUser());
    }

    @Test
    public void addUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void login() {
    }

    @Test
    public void getAllUserByPage() {
    }

    @Test
    public void resetPassWord() {
    }

    @Test
    public void getUsersByDate() {
    }

    @Test
    public void testGetUsersByDate() {
    }
}