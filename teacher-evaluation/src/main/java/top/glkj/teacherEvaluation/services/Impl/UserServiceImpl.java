
package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.User;
import top.glkj.teacherEvaluation.mapper.UserMapper;
import top.glkj.teacherEvaluation.services.UserService;
/**
 * 需要加@Service
 * @author ：高铭
 * @date ：Created in 2020/9/14 10:37
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisTemplate<Object, User> userRedisTemplate;

    /**
     *
     * @param loginName
     * @return
     */
    @Override
    @Cacheable(cacheNames = "user",key = "#loginName")
    public User getUerByName(String loginName) {
        return userMapper.getUerByName(loginName);
    }

    @Override
    public int insertUserByName(User user) {
        return userMapper.insertUserByName(user);
    }

    @Override
    public int updateUserByName(User user) {
        return userMapper.updateUserByName(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }
}
