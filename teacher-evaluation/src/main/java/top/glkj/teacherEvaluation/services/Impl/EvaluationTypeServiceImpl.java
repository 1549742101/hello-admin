package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.EvaluationType;
import top.glkj.teacherEvaluation.mapper.EvaluationTypeMapper;
import top.glkj.teacherEvaluation.services.EvaluationTypeService;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/16 16:51
 */
@Service
public class EvaluationTypeServiceImpl implements EvaluationTypeService {

    @Autowired
    EvaluationTypeMapper evaluationTypeMapper;

    /**
     * 查询所有类型
     *
     * @return EvaluationType
     */
    @Override
    public EvaluationType getEvaluationType() {
        return evaluationTypeMapper.getEvaluationType();
    }

    /**
     * 根据id查询评教类型
     *
     * @param id id
     * @return EvaluationType
     */
    @Override
    public EvaluationType getEvaluationTypeById(int id) {
        return evaluationTypeMapper.getEvaluationTypeById(id);
    }

    /**
     * 新增一个评教类型
     *
     * @param evaluationType evaluationType 对象
     * @return boolean
     */
    @Override
    public boolean addEvaluationType(EvaluationType evaluationType) {
        return evaluationTypeMapper.addEvaluationType(evaluationType);
    }

    /**
     * 新修改一个评教类型
     *
     * @param evaluationType evaluationType 对象
     * @return boolean
     */
    @Override
    public boolean updateEvaluationTypeById(EvaluationType evaluationType) {
        return evaluationTypeMapper.updateEvaluationTypeById(evaluationType);
    }

    /**
     * 删除一个评教类型
     *
     * @param id id
     * @return boolean
     */
    @Override
    public boolean deleteEvaluationType(int id) {
        return evaluationTypeMapper.deleteEvaluationType(id);
    }
}
