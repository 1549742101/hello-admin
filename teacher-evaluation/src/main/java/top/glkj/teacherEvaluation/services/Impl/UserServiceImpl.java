/**
 * @author ：高铭
 * @date ：Created in 2020/9/14 10:37
 * @description：
 * @modified By：
 * @version: $
 */
package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.User;
import top.glkj.teacherEvaluation.mapper.UserMapper;
import top.glkj.teacherEvaluation.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    RedisTemplate<Object, User> userRedisTemplate;

    @Override
    @Cacheable(cacheNames = "user",key = "#loginName")
    public User getUserByLoginName(String loginName) {
        User uerByLoginName = userMapper.getUerByLoginName(loginName);
        return uerByLoginName;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean updateUserPassword(User user, String password) {
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }
}
