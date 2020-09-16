package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

/**
 * 问卷类型
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 11:41
 * | 字段名         | 类型         | 描述     |
 * | -------------- | ------------ | -------- |
 * | id             | int          | 类型编号 |
 * | name           | varchar(20)  | 类型名称 |
 * | sort           | int          | 排序     |
 * | weights        | decimal(4,2) | 权重     |
 * permissions_id   |varchar(100)  |需要权限   |
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Evaluation extends BaseEntity{
    private int id;
    private String evaName;
    private String permissionsId;
    /**
     * 评卷教师用户编号
     */
    private int userId;
    /**
     * 评教开始时间
     */
    private Date startTime;
    /**
     * 评教结束时间
     */
    private Date endTime;
    /**
     * 能评价该问卷的用户和评卷状态
     */
    private Set<EvaluationUser> evaluationUsers;
}
