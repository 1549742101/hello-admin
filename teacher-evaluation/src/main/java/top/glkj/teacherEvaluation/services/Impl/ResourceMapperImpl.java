package top.glkj.teacherEvaluation.services.Impl;

import top.glkj.teacherEvaluation.bean.Resource;
import top.glkj.teacherEvaluation.services.ResourceMapper;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/17 18:23
 */
public class ResourceMapperImpl implements ResourceMapper {
    /**
     * 查询所有
     *
     * @return Resource
     */
    @Override
    public List<Resource> getResource() {
        return null;
    }

    /**
     * 插入
     *
     * @param resource Resource
     * @return boolean
     */
    @Override
    public boolean insertResource(Resource resource) {
        return false;
    }

    /**
     * 更新
     *
     * @param resource Resource
     * @return boolean
     */
    @Override
    public boolean updateResourceById(Resource resource) {
        return false;
    }

    /**
     * 删除
     *
     * @param id id
     * @return boolean
     */
    @Override
    public boolean deleteResource(int id) {
        return false;
    }
}
