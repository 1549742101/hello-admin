package top.glkj.teacherEvaluation.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.glkj.teacherEvaluation.bean.QuestionPermission;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/20 16:36
 */
@Mapper
public interface QuestionPermissionMapper {
    /**
     * 根据id查询答案
     * @param id id
     * @return Questionnaire
     */
    public List<QuestionPermission> selectQuestionPermissionById(int id);

    /**
     * 根据typeId （评教类型id）查询答案
     * @param questionId  questionId
     * @return Questionnaire
     */
    public List<QuestionPermission> selectQuestionPermissionByQuestionId(int questionId);

    /**
     * 无条件查询所有答案
     * @return Questionnaire
     */
    public List<QuestionPermission> selectQuestionPermission();
    /**
     * 插入一个答案
     * @param questionPermission addQuestionPermission对象
     * @return boolean
     */
    public boolean addQuestionPermission(QuestionPermission questionPermission);

    /**
     *更新一个答案
     * @param questionPermission addQuestionPermission对象
     * @return boolean
     */
    public boolean updatedQuestionPermissionById(QuestionPermission questionPermission);

    /**
     *删除一个答案
     * @param id id
     * @return boolean
     */
    public boolean deleteQuestionPermission(int id);

}
