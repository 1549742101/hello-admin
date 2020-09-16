package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
/**
 * @author ：高铭
 * @date ：Created in 2020/9/15 14:21
 * 保存教师成绩结果
 * | 字段名      | 类型     | 描述                           |
| ----------- | -------- | ------------------------------ |
| id          | int      | （被评教师id）                 |
| type        | int      | 评教类型（学生、互评、学院评） |
| total_score | int      | 总分                           |
| date        | datetime | 日期                           |
| batch       | int      | 批次                           |
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Result extends BaseEntity {
    private User teacher;
    private int type;
    private int totalScore;
    private Date date;
    private int batch;
}
