package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.Questionnaire;
import top.glkj.teacherEvaluation.mapper.QuestionnaireMapper;
import top.glkj.teacherEvaluation.services.QuestionnaireService;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/16 16:46
 */
@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

    @Autowired
    QuestionnaireMapper questionnaireMapper;

    /**
     * 根据id查询评教问卷表题目
     *
     * @param id id
     * @return Questionnaire
     */
    @Override
    public List<Questionnaire> selectQuestionnaireById(int id) {
        return questionnaireMapper.selectQuestionnaireById(id);
    }

    /**
     * 根据typeId （评教类型id）查询评教问卷表题目
     *
     * @param typeId 类型id
     * @return Questionnaire
     */
    @Override
    public List<Questionnaire> selectQuestionnaireByTypeId(int typeId) {
        return questionnaireMapper.selectQuestionnaireByTypeId(typeId);
    }

    /**
     * 无条件查询所有评教问卷表题目
     *
     * @return Questionnaire
     */
    @Override
    public List<Questionnaire> selectQuestionnaire() {
        return questionnaireMapper.selectQuestionnaire();
    }

    /**
     * 插入一个题目
     *
     * @param questionnaire addQuestionnaire对象
     * @return boolean
     */
    @Override
    public boolean addQuestionnaire(Questionnaire questionnaire) {
        return questionnaireMapper.addQuestionnaire(questionnaire);
    }

    /**
     * 更新一个题目
     *
     * @param questionnaire addQuestionnaire对象
     * @return boolean
     */
    @Override
    public boolean updateUserById(Questionnaire questionnaire) {
        return questionnaireMapper.updateUserById(questionnaire);
    }

    /**
     * 删除一个题目
     *
     * @param id 根据id删除
     * @return boolean
     */
    @Override
    public boolean deleteQuestionnaire(int id) {
        return questionnaireMapper.deleteQuestionnaire(id);
    }
}
