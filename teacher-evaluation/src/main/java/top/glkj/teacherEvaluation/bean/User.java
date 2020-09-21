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
 * | management  | int           | 账号管理（暂停、禁用、开启）   |
 * | user_name   | varchar(20)            | 用户名                         |
 * | login_pass  | varchar(100)           | 用户密码                       |
 * | user_phone  | int                    | 用户手机号              |
 * | college_id  | int                    | 一个用户绑定一个学院（多对一） |
 * | create_man   | varchar                | 创建者（待定）                 |
 * | create_time  | datetime               | 创建时间（待定）               |
 * | change_time | datetime               | 改动时间（待定）               |
 * | del_logic  /int             |是否逻辑上删除（待定）
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
    private int id;
    private String loginName;
    private String loginPass;
    private String userName;
    /**
     * 账号状态
     */
    private int management;
    /**
     * 创建人
     */
    private String createMan;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date changeTime;
    /**
     * 逻辑删除
     */
    private int delLogic;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 学院id
     */
    private int collegeId;
    /**
     * 根据数据库college_id绑定学院
     */
    private College college;
    /**
     * 当前用户下所拥有的权限
     * user_per关联表对应查询
     */
    private Set<Permission> permissions;

    public void setCollegeById(){
        this.college = new College();
        this.college.setId(this.collegeId);
    }
}
