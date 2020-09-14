package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * ## 答案权重表（question_permission）
 *
 * 描述：存储答案权重分数
 *
 * | 字段名      | 类型         | 描述     |
 * | ----------- | ------------ | -------- |
 * | id          | int          | 答案号   |
 * | answer      | varchar(100) | 答案选项 |
 * | sort        | int          | 答案排序 |
 * | score       | int          | 答案分值 |
 * | question_id | int          | 题目编号 |
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 15:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class QuestionPermission extends BaseEntity{
    private int id;
    private String answer;
    private int sort;
    private double score;
    private int questionId;
}
