package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.Permission;
import top.glkj.teacherEvaluation.mapper.PermissionMapper;
import top.glkj.teacherEvaluation.services.PermissionService;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/16 10:58
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    @Override
    @Cacheable(cacheNames = "Permission",key = "#id")
    public List<Permission> selectPermission(int id) {
        return permissionMapper.selectPermission(id);
    }
}
