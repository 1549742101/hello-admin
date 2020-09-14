package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 可以用@Data
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/8 11:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    public Integer id;
    public String loginName;
    public String userName;
    public String loginPass;
    public Integer userPerId;

}
