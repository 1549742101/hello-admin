package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * 用户表
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/8 11:42
 * | 字段名     | 类型         | 描述     |
 * | ---------- | ------------ | -------- |
 * | id         | int          | 用户标识 |
 * | login_name | varchar(20)  | 用户工号 |
 * | user_name  | varchar(20)  | 用户名   |
 * | login_pass | varchar(100) | 用户密码 |
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
    private int id;
    private String loginName;
    private String passWord;
    private String userName;
    /**
     * 当前用户下所拥有的权限
     */
    private Set<Permission> permissions;
}
