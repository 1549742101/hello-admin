package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.Result;

import top.glkj.teacherEvaluation.mapper.ResultMapper;
import top.glkj.teacherEvaluation.services.ResultService;

import java.util.List;

/**
 * @author PC
 */
@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    ResultMapper resultMapper;

    /**
     * 获取所有结果
     *
     * @return Result对象
     */
    @Override
    public List<Result> getAllResult() {

        return resultMapper.getAllResult();
    }

    /**
     * 根据id查询Result（结果）
     *
     * @param id 传入id
     * @return Result对象
     */
    @Override
    public List<Result> getResultById(int id) {
        return resultMapper.getResultById(id);
    }

    /**
     * 根据type[评教类型（学生、互评、学院评）]查询Result（结果）
     *
     * @param type 传入type
     * @return Result对象
     */
    @Override
    public List<Result> getResultByType(int type) {
        return resultMapper.getResultByType(type);
    }

    /**
     * 根据totalScore(总分)查询Result（结果）
     *
     * @param totalScore
     * @return Result对象
     */
    @Override
    public List<Result> getResultByTotalScore(int totalScore) {
        return resultMapper.getResultByTotalScore(totalScore);
    }

    /**
     * 根据batch(批次)查询Result（结果）
     *
     * @param batch
     * @return Result对象
     */
    @Override
    public List<Result> getResultByBatch(int batch) {
        return resultMapper.getResultByBatch(batch);
    }

    /**
     * 插入
     *
     * @param result
     * @return boolean
     */
    @Override
    public boolean insertResult(Result result) {
        return false;
    }

    /**
     * 更新
     *
     * @param result
     * @return boolean
     */
    @Override
    public boolean updateResultById(Result result) {
        return false;
    }

    /**
     * 删除
     *
     * @param id
     * @return boolean
     */
    @Override
    public boolean deleteResult(int id) {
        return false;
    }
}
