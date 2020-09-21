package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.QuestionPermission;
import top.glkj.teacherEvaluation.mapper.QuestionPermissionMapper;
import top.glkj.teacherEvaluation.services.QuestionPermissionService;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/20 17:17
 */

@Service
public class QuestionPermissionServiceImpl implements QuestionPermissionService {

    @Autowired
    QuestionPermissionMapper questionPermissionMapper;
    @Autowired
    RedisTemplate<Object, QuestionPermission> questionPermissionRedisTemplate;

    /**
     * 根据id查询答案
     * @param id id
     * @return Questionnaire
     */
    @Override
    @Cacheable(cacheNames = "QuestionPermission",key = "#id")
    public List<QuestionPermission> selectQuestionPermissionById(int id) {
        return  questionPermissionMapper.selectQuestionPermissionById(id);
    }
    /**
     * 根据typeId （评教类型id）查询答案
     * @param questionId questionId
     * @return Questionnaire
     */
    @Override
    @Cacheable(cacheNames = "QuestionPermission",key = "T(String).valueOf(#questionId).concat('-').concat('questionId')")
    public List<QuestionPermission> selectQuestionPermissionByQuestionId(int questionId) {

        return questionPermissionMapper.selectQuestionPermissionByQuestionId(questionId);
    }

    /**
     * 无条件查询所有答案
     *
     * @return Questionnaire
     */
    @Override
    @Cacheable(cacheNames = "QuestionPermission")
    public List<QuestionPermission> selectQuestionPermission() {
        return questionPermissionMapper.selectQuestionPermission();
    }

    /**
     *
     * @param questionPermission addQuestionPermission对象
     * @return boolean
     */
    @Override
    public boolean addQuestionPermission(QuestionPermission questionPermission) {
        return questionPermissionMapper.addQuestionPermission(questionPermission);
    }

    /**
     * 更新一个答案
     *
     * @param questionPermission addQuestionPermission对象
     * @return boolean
     */
    @Override
    public boolean updatedQuestionPermissionById(QuestionPermission questionPermission) {
        return questionPermissionMapper.updatedQuestionPermissionById(questionPermission);
    }

    /**
     * 删除一个答案
     * @param id id
     * @return boolean
     */
    @Override
    public boolean deleteQuestionPermission(int id) {
        return questionPermissionMapper.deleteQuestionPermission(id);
    }
}
