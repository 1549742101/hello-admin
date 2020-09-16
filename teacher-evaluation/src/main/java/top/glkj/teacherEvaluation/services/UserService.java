package top.glkj.teacherEvaluation.services;

import top.glkj.teacherEvaluation.bean.User;

/**
 *
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/8 11:43
 */

public interface UserService {
    /**
     *根据工号或者学号进行登录
     * @param loginName
     * @return
     */
    public User getUerByName(String loginName);

    /**
     *新增一个用户
     * @param user
     * @return
     */
    public int insertUserByName(User user);

    /**
     * 改变信息
     * @param user
     * @return
     */
    public int updateUserByName(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    public int deleteUser(int id);
}
