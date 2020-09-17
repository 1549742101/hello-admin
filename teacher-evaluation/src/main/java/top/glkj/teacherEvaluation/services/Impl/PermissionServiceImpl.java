package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import top.glkj.teacherEvaluation.bean.Permission;
import top.glkj.teacherEvaluation.mapper.PermissionMapper;
import top.glkj.teacherEvaluation.services.PermissionService;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/16 10:58
 */
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionMapper permissionMapper;
    @Autowired
    RedisTemplate<Object, Permission> permissionRedisTemplate;

    @Override
    public Permission selectPermission(int id) {
        return permissionMapper.selectPermission(id);
    }
}
