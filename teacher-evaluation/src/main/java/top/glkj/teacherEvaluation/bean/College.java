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
     */
    private Set<ClassRoom> classRooms;
}
