package top.glkj.teacherEvaluation.mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.glkj.teacherEvaluation.bean.User;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserMapperTest {
    @Resource
//    @Autowired
    UserMapper userMapper;
    @Test
    void getUerById() {
        User user =  userMapper.getUerByName("179000312");
        User user1 =  new User();
        user1.setUserName("瞿嘉");
        user1.setUserPhone("111111");
        user1.setPassWord("123456");
        user1.setCreateMan("高铭");
//        user1.set;
//        user1.setCreateTime(2020/9/17);
        System.out.println(user);
    }
}