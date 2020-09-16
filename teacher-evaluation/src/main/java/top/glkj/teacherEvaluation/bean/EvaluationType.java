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
 *## 评教类型表（evaluation_type）
 *
 * 描述：存储评教级别
 *
 * | 字段名         | 类型         | 描述         |
 * | -------------- | ------------ | ------------ |
 * | id             | int          | 类型编号     |
 * | name           | varchar(20)  | 类型名称     |
 * | permissions_id | varchar(100) | 需要权限     |
 * | sort           | int          | 排序         |
 * | weights        | decimal(4,2) | 权重         |
 * | start_time     | date         | 评教开始时间 |
 * | end_time       | date         | 评教结束时间 |
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EvaluationType extends BaseEntity{
    private int id;
    private String evaName;
    /**
     * 需要权限
     */
    private String permissionsId;
    /**
     * 排序
     */
    private int sort;
    /**
     * 权重
     */
    private int weights;
    /**
     * 评教开始时间
     */
    private Date startTime;
    /**
     * 评教结束时间
     */
    private Date endTime;
    /**
     * 能评该问卷的用户的权限
     */
    private Set<Permission> permissions;
}
