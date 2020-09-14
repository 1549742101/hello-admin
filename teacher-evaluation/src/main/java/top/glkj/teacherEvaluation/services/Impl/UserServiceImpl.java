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
    UserMapper userMapper;

    @Autowired
    RedisTemplate<Object, User> userredisTemplate;

    /**
     *
     * @param loginName
     * @return
     */
    @Override
    @Cacheable(cacheNames = "user",key = "#loginName")
    public User getUerByName(String loginName) {
        User user = userMapper.getUerByName(loginName);
        return user;
    }
}
