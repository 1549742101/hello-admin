package top.glkj.teacherEvaluation.services;

import top.glkj.teacherEvaluation.bean.Permission;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/16 10:58
 */
public interface PermissionService {
    /**
     *
     * @param id 用户传入的id
     * @return   Permission
     */
    public List<Permission> selectPermission(int id);

}
