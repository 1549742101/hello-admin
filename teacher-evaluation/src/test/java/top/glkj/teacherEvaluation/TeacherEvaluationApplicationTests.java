package top.glkj.teacherEvaluation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.glkj.teacherEvaluation.bean.User;
import top.glkj.teacherEvaluation.mapper.UserMapper;

@SpringBootTest
class TeacherEvaluationApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	UserMapper userMapper;

	public User getUerById(){
//		User user = userMapper.getUerByName(1);
//		System.out.println(user);
		return null;
	}

}
