package top.glkj.teacherEvaluation.services.Impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.glkj.teacherEvaluation.bean.QuestionPermission;
import top.glkj.teacherEvaluation.services.QuestionPermissionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionPermissionServiceImplTest {
    @Autowired
    QuestionPermissionService questionPermissionMapper;

    @Test
    public void selectQuestionPermissionById() {
        System.out.println(questionPermissionMapper.selectQuestionPermissionById(1));
    }

    @Test
    public void selectQuestionPermissionByQuestionId() {
        System.out.println(questionPermissionMapper.selectQuestionPermissionByQuestionId(2));
    }

    @Test
    public void selectQuestionPermission() {
        System.out.println(questionPermissionMapper.selectQuestionPermission());
    }

    @Test
    public void addQuestionPermission() {
        QuestionPermission questionPermission = new QuestionPermission();
        questionPermission.setAnswer("测试AB");
        questionPermission.setSort(10);
        questionPermission.setQuestionId(1);
        questionPermission.setScore(80);
        questionPermissionMapper.addQuestionPermission(questionPermission);
    }

    @Test
    public void updatedQuestionPermissionById() {
        QuestionPermission questionPermission = new QuestionPermission();
        questionPermission.setId(3);
        questionPermission.setAnswer("测试更新B");
        questionPermission.setSort(10);
        questionPermission.setQuestionId(1);
        questionPermission.setScore(80);
        questionPermissionMapper.updatedQuestionPermissionById(questionPermission);
    }

    @Test
    public void deleteQuestionPermission() {
        questionPermissionMapper.deleteQuestionPermission(2);
    }
}