package top.glkj.teacherEvaluation.services;

import top.glkj.teacherEvaluation.bean.User;

/**
 * 需要加@Service
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/8 11:43
 */

public interface UserService {
    public User getUerById(Integer id);
}
