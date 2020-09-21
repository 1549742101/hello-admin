package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 11:32
 * | 字段名       | 类型        | 描述       |
 * | ------------ | ----------- | ---------- |
 * | id           | int         | 班级编号   |
 * | counselor_id | int         | 辅导员编号 |
 * | name         | varchar(20) | 班级代号   |
 * | profession   | varchar(20) | 班级专业   |
 * | col_id       | int         | 学院编号   |
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class ClassRoom extends BaseEntity{
    private int id;
    private int counselorId;
    private User counselorUser;
    private String className;
    private String profession;
    /**
     * 当前班级所有课程
     */
    private Set<Course> course;
    /**
     * 当前班级所有学生
     */
    private Set<User> students;
    /**
     * 当前班级所在学院
     */
    private College college;
    private int colId;
}
