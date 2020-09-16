package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

/**
 * 用户表
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/8 11:42
 * | 字段名      | 类型                   | 描述                           |
 * | ----------- | ---------------------- | ------------------------------ |
 * | id          | int                    | 用户标识                       |
 * | login_name  | varchar(20)            | 用户工号                       |
 * | management  | varchar(3)             | 账号管理（暂停、禁用、开启）   |
 * | user_name   | varchar(20)            | 用户名                         |
 * | login_pass  | varchar(100)           | 用户密码                       |
 * | user_phone  | int                    | 中间表id（改动）               |
 * | college_id  | int                    | 一个用户绑定一个学院（多对一） |
 * | createman   | varchar                | 创建者（待定）                 |
 * | createtime  | datetime               | 创建时间（待定）               |
 * | change_time | datetime               | 改动时间（待定）               |
 * | del_logic  /varchar(1)               |是否逻辑上删除（待定）
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
    private String management;
    private String createMan;
    private Date createTime;
    private Date changeTime;
    private String delLogic;
    private String userPhone;
    private int collegeId;
    /**
     * 当前用户下所拥有的权限
     */
    private Set<Permission> permissions;
}
