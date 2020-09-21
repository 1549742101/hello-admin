package top.glkj.teacherEvaluation.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.glkj.teacherEvaluation.bean.Result;

import java.util.List;


@Mapper
public interface ResultMapper {
    /**
     * 获取所有结果
     * @return Result对象
     */
    public List<Result> getAllResult();

    /**
     * 根据id查询Result（结果）
     * @param id 传入id
     * @return Result对象
     */
    public List<Result> getResultById(int id);

    /**
     * 根据type[评教类型（学生、互评、学院评）]查询Result（结果）
     * @param type 传入type
     * @return Result对象
     */
    public List<Result> getResultByType(int type);

    /**
     * 根据totalScore(总分)查询Result（结果）
     * @param totalScore
     * @return Result对象
     */
    public List<Result> getResultByTotalScore(int totalScore);

    /**
     * 根据batch(批次)查询Result（结果）
     * @param batch
     * @return Result对象
     */
    public List<Result> getResultByBatch(int batch);

    /**
     * 插入
     * @param result
     * @return boolean
     */
    boolean insertResult(Result result);

    /**
     * 更新
     * @param result
     * @return boolean
     */
    boolean updateResultById(Result result);

    /**
     * 删除
     * @param id
     * @return boolean
     */
    boolean deleteResult(int id);


}
