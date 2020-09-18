package top.glkj.teacherEvaluation.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.glkj.teacherEvaluation.bean.User;

import java.util.List;

/**
 * 需要加@Mapper
 * @author : xgl
 * @version : 0.0.2
 * @date :2020/9/8 11:42
 */
@Mapper
public interface UserMapper {
    /**
     *根据工号或者学号进行登录
     * @param loginName 登录名
     * @return user
     */
    public User getUserByName(String loginName);

    /**
     * 获取所有用户
     * @return 用户
     */
    public List<User> getAllUser();

    /**
     *新增一个用户
     * @param user 用户
     * @return 成功>0
     */
    public int addUser(User user);

    /**
     * 改变信息
     * @param user 用户
     * @return 成功>0
     */
    public int updateUser(User user);

    /**
     * 根据id删除用户
     * @param id 用户id
     * @return 成功>0
     */
    public int deleteUser(int id);

    /**
     * 根据id修改密码
     * @param id 用户id
     * @param password 用户密码
     * @return 修改结果
     */
    public int updateUserPassWord(int id,String password);
}
