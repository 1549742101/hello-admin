package top.glkj.teacherEvaluation.services;

import org.springframework.data.domain.Page;
import top.glkj.teacherEvaluation.bean.User;

import java.util.List;

/**
 *
 * @author : xgl
 * @version : 0.0.2
 * @date :2020/9/8 11:43
 */

public interface UserService {
    /**
     *根据工号或者学号进行登录
     * @param loginName 登录名
     * @return 用户
     */
    public User getUerByName(String loginName);

    /**
     * 获取所有用户
     * @return 用户集合
     */
    public List<User> getAllUser();

    /**
     *新增一个用户
     * @param user 用户
     * @return 添加成功：true 添加失败：false
     */
    public boolean addUser(User user);

    /**
     * 改变信息
     * @param user 用户
     * @return 改变成功： true 添加失败： false
     */
    public boolean updateUser(User user);

    /**
     * 根据id删除用户
     * @param id 用户编号
     * @return 删除成功：true 删除失败：false
     */
    public boolean deleteUser(int id);

    /**
     * 判断用户登录
     * @return 根据用户名获取用户
     * @param user 根据用户名查询出来的用户
     * @param password 用户输入的密码
     */
    public boolean login(User user,String password);

    /**
     *  分页查询
     * @param page 当前页
     * @param size 页面大小
     * @return 页面的值
     */
    public Page<User> getAllUserByPage(int page,int size);

    /**
     * 修改密码
     * @param id 用户id
     * @param password 用户新密码
     * @return 修改密码是否成功
     */
    public boolean resetPassWord(int id,String password);
}
