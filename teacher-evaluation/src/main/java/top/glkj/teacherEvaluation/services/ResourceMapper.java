package top.glkj.teacherEvaluation.services;

import top.glkj.teacherEvaluation.bean.Resource;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/17 18:22
 */
public interface ResourceMapper {
    /**
     * 查询所有
     * @return Resource
     */
     List<Resource> getResource();

    /**
     * 插入
     * @param resource Resource
     * @return boolean
     */
    boolean insertResource(Resource resource);

    /**
     * 更新
     * @param resource  Resource
     * @return boolean
     */
    boolean updateResourceById(Resource resource);

    /**
     * 删除
     * @param id id
     * @return boolean
     */
    boolean deleteResource(int id);
}
