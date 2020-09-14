package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 11:20
 * 问卷题目和权重
 * | 字段名    | 类型         | 描述     |
 * | --------- | ------------ | -------- |
 * | id        | int          | 题号     |
 * | name      | varchar(100) | 题目名称 |
 * | sort      | int          | 排序     |
 * | weights   | decimal(4,2) | 权重     |
 * | parent_id | int          | 当前级别 |
 * | type_id   | int          | 类型编号 |
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Questionnaire extends BaseEntity{
    private int id;
    private String queName;
    private int sort;
    private double weights;
    private int parentId;
    private int typeId;
    private Set<QuestionPermission> questionPermissions;
}
