package top.glkj.teacherEvaluation.mapper;

import top.glkj.teacherEvaluation.bean.Permission;

/**
 *
 * 获取权限
 * @author ：高铭
 * @date ：Created in 2020/9/16 10:16
 */
public interface PermissionMapper {
    /**
     *查看当前用户的权限
     * @param id 用户传入的id
     * @return   Permission
     */
    public Permission selectPermission(int id);

}
