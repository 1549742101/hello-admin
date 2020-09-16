package top.glkj.teacherEvaluation.services;

import top.glkj.teacherEvaluation.bean.User;

/**
 * 需要加@Service
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/8 11:43
 */

public interface UserService {
    /**
     * 根据用户登录名获取用户
     * @param loginName 登录名
     * @return user
     */
    public User getUserByLoginName(String loginName);
    public boolean addUser(User user);
    public boolean updateUser(User user);
    public boolean updateUserPassword(User user,String password);
    public boolean deleteUser(int id);

}
