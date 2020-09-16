package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * ## 答案分数表(grades)
 *
 * 描述：存储分数
 *
 * | 字段名      | 类型 | 描述     |
 * | ----------- | ---- | -------- |
 * | id          | int  | 答案号   |
 * | question_id | int  | 题目id   |
 * | user_id     | int  | 评教用户 |
 * | answer_id   | int  | 答案结果 |
 * teacher_id    | int   |（被评教师id）|
 * batch         | int   |批次（哪一个批次）
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 15:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Grandes extends BaseEntity{
    private int id;
    private int questionId;
    private int userId;
    private int answerId;
    private int teacherId;
    private int batch;
}
