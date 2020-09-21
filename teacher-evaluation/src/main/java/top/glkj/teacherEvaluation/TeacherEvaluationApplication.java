package top.glkj.teacherEvaluation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author xgl
 */
@SpringBootApplication
@EnableCaching
public class TeacherEvaluationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherEvaluationApplication.class, args);
	}

}
