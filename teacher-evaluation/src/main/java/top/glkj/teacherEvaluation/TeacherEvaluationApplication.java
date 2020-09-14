package top.glkj.teacherEvaluation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("top.glkj.teacherEvaluation.mapper")
@SpringBootApplication
public class TeacherEvaluationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherEvaluationApplication.class, args);
	}

}
