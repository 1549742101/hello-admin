package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 15:12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EvaluationUser extends BaseEntity{
    private User user;
    private boolean status;
}
