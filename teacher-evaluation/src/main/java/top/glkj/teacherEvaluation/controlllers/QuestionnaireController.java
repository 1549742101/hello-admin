package top.glkj.teacherEvaluation.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.glkj.teacherEvaluation.bean.Questionnaire;
import top.glkj.teacherEvaluation.services.QuestionnaireService;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/18 10:48
 */
@RestController
public class QuestionnaireController {
    @Autowired
    QuestionnaireService questionnaireService;
    @RequestMapping("/que")
    public List<Questionnaire> getAllQuestionnaire(){
        return questionnaireService.selectQuestionnaire();
    }

}
