package top.glkj.teacherEvaluation.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.glkj.teacherEvaluation.bean.User;

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
        for (int i = 40; i < 99; i++) {
            User user = new User();
            user.setLoginName("1790003"+i);
            user.setLoginPass("123456");
            user.setCreateMan("admin");
            user.setDelLogic(0);
            user.setUserName("test"+i);
            user.setManagement(1);
            user.setUserPhone("134567891"+i);
            assertTrue(userService.addUser(user));
        }
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
        assertTrue(userService.deleteUser(3));
        assertTrue(userService.deleteUser(4));
    }

    @Test
    public void login() {
    }

    @Test
    public void getAllUserByPage() {
    }

    @Test
    public void resetPassWord() {
        assertTrue(userService.resetPassWord(1,"123456"));
        assertTrue(userService.resetPassWord(2,"123456"));
    }

    @Test
    public void getUsersByDate() {
    }

    @Test
    public void testGetUsersByDate() {

    }
}