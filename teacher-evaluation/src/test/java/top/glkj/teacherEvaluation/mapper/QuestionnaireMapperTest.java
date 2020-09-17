package top.glkj.teacherEvaluation.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.glkj.teacherEvaluation.bean.Questionnaire;
import top.glkj.teacherEvaluation.services.QuestionnaireService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionnaireMapperTest {
    @Autowired
    QuestionnaireService questionnaireMapper;



    @Test
    public void selectQuestionnaireById() {
        System.out.println("id查:"+questionnaireMapper.selectQuestionnaireById(1));
    }

    @Test
    public void selectQuestionnaireByTypeId() {
        System.out.println("typeId查："+questionnaireMapper.selectQuestionnaireByTypeId(1));
    }

    @Test
    public void selectQuestionnaire() {

        List<Questionnaire> questionnaire = questionnaireMapper.selectQuestionnaire();
            System.out.println(questionnaire);
    }

    @Test
    public void addQuestionnaire() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.setQueName("测试题目");
        questionnaire.setParentId(0);
        questionnaire.setSort(20);
        questionnaire.setTypeId(1);
        questionnaire.setWeights(0.15);
        boolean rs = questionnaireMapper.addQuestionnaire(questionnaire);
        System.out.println("增加测试:"+rs);
    }

    @Test
    public void updateUserById() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.setId(6);
        questionnaire.setQueName("测试题目2");
        questionnaire.setParentId(1);
        questionnaire.setSort(200);
        questionnaire.setTypeId(10);
        questionnaire.setWeights(0.85);
        boolean rs = questionnaireMapper.updateUserById(questionnaire);
        System.out.println("更新测试:"+rs);
    }

    @Test
    public void deleteQuestionnaire() {
        boolean rs = questionnaireMapper.deleteQuestionnaire(6);
        System.out.println("删除测试:"+rs);
    }
}