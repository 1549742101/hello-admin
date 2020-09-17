package top.glkj.teacherEvaluation.services;

import top.glkj.teacherEvaluation.bean.EvaluationType;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/16 16:33
 */
public interface EvaluationTypeService {

    /**
     *  查询所有类型
     * @return  EvaluationType
     */
    public List<EvaluationType> getEvaluationType();
    /**
     *  根据查询评教类型
     * @param id id
     * @return  EvaluationType
     */
    public List<EvaluationType> getEvaluationTypeById(int id);

    /**
     * 新增一个评教类型
     * @param evaluationType evaluationType 对象
     * @return boolean
     */
    public boolean addEvaluationType(EvaluationType evaluationType);
    /**
     *新修改一个评教类型
     * @param evaluationType evaluationType 对象
     * @return boolean
     */
    public boolean updateEvaluationTypeById(EvaluationType evaluationType);
    /**
     * 删除一个评教类型
     * @param id id
     * @return boolean
     */
    public boolean deleteEvaluationType(int id);

}
