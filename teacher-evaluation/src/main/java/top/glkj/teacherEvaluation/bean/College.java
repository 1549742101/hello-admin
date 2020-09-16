package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 11:23
 * ## 学院表(college)
 *
 * 描述：存储学院信息
 *
 * | 字段名 | 类型        | 描述     |
 * | ------ | ----------- | -------- |
 * | id     | int         | 学院编号 |
 * | name   | varchar(20) | 学院名称 |
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class College extends BaseEntity{
    private int id;
    private String colName;
    /**
     * 当前学院拥有的班级
     * 根据classroom的col_id关联
     */
    private Set<ClassRoom> classRooms;
}
