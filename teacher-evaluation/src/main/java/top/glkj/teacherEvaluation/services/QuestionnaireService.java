package top.glkj.teacherEvaluation.services;

import top.glkj.teacherEvaluation.bean.Questionnaire;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/16 16:42
 */
public interface QuestionnaireService {
    /**
     * 根据id查询评教问卷表题目
     * @param id id
     * @return Questionnaire
     */
    public List<Questionnaire> selectQuestionnaireById(int id);

    /**
     * 根据typeId （评教类型id）查询评教问卷表题目
     * @param typeId 类型id
     * @return Questionnaire
     */
    public List<Questionnaire> selectQuestionnaireByTypeId(int typeId);

    /**
     * 无条件查询所有评教问卷表题目
     * @return Questionnaire
     */
    public List<Questionnaire> selectQuestionnaire();
    /**
     * 插入一个题目
     * @param questionnaire addQuestionnaire对象
     * @return boolean
     */
    public boolean addQuestionnaire(Questionnaire questionnaire);

    /**
     *更新一个题目
     * @param questionnaire addQuestionnaire对象
     * @return boolean
     */
    public boolean updateUserById(Questionnaire questionnaire);

    /**
     *删除一个题目
     * @param id 根据id删除
     * @return boolean
     */
    public boolean deleteQuestionnaire(int id);

}
