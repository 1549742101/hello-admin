
package top.glkj.teacherEvaluation.services.Impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.User;
import top.glkj.teacherEvaluation.mapper.UserMapper;
import top.glkj.teacherEvaluation.services.UserService;
import top.glkj.teacherEvaluation.utils.CodeUtils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
/**
 * @author ：高铭
 * @date ：Created in 2020/9/14 10:12
 * @version 0.0.2
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisTemplate<Object, User> userRedisTemplate;

    @Override
    @Cacheable(cacheNames = "user",key = "#loginName")
    public User getUerByName(String loginName) {
        return userMapper.getUserByName(loginName);
    }

    /**
     * 获取所有用户
     *
     * @return 用户集合
     */
    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public boolean addUser(User user) {
        if (user.getLoginName()!=null&&user.getPassWord()!=null){
            try {
                user.setPassWord(CodeUtils.getEncryptedPwd(user.getPassWord()));
            } catch (NoSuchAlgorithmException e) {
                log.info(e.getMessage());
                return false;
            }
            return userMapper.addUser(user)>0;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user)>0;
    }

    @Override
    public boolean deleteUser(int id) {
        return userMapper.deleteUser(id)>0;
    }

    /**
     * 判断用户登录
     *
     * @param user     根据用户名查询出来的用户
     * @param password 用户输入的密码
     * @return 根据用户名获取用户
     */
    @Override
    public boolean login(User user, String password) {
        try {
            if (CodeUtils.validPassword(password,user.getPassWord())){
                return true;
            }else {
                return false;
            }
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            log.info(e.getMessage());
            return false;
        }
    }

    @Override
    public Page<User> getAllUserByPage(int page, int size) {
        return null;
    }

    /**
     * 修改密码
     *
     * @param id       用户id
     * @param password 用户新密码
     * @return 修改密码是否成功
     */
    @Override
    public boolean resetPassWord(int id, String password) {
        return false;
    }
}
