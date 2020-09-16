package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 11:25
 *## 科目表(course)
 *
 * 描述：存储课程信息
 *
 * | 字段名      | 类型         | 描述         |
 * | ----------- | ------------ | ------------ |
 * | credit      | int          | 学分         |
 * | description | varchar(128) | 描述         |
 * | id          | int          | 课程编号     |
 * | name        | varchar(20)  | 课程名称     |
 * | start_time  | datetime     | 授课开始时间 |
 * | end_time    | datetime     | 授课结束时间 |
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Course extends BaseEntity{
    private int id;
    private int credit;
    private String description;
    private String couName;
    /**
     * 存储上该课程的教师
     */
    private Set<User> teachers;
    private Date startTime;
    private Date endTime;
    /**
     * 存储上该门课程的班级
     */
    Set<ClassRoom> classRooms;
}
