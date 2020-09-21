package top.glkj.teacherEvaluation.services.Impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.glkj.teacherEvaluation.services.ResultService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResultServiceImplTest {
    @Autowired
    ResultService resultService;
    @Test
    public void getAllResult() {
        System.out.println(resultService.getAllResult());
    }
}