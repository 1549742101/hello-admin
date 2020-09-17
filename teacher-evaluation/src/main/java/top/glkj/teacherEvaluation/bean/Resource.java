package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * 资源表（菜单）
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 8:37
 *| 字段名    | 类型        | 描述           |
 * | --------- | ----------- | -------------- |
 * | id        | int         | 资源标识       |
 * | name      | varchar(20) | 资源名称       |
 * | url       | varchar(20) | 资源路径       |
 * | level    | int         | 判断是几级菜单 |
 * | parent_id | int         | 父级菜单编号   |
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Resource extends BaseEntity{
    private int id;
    private String resName;
    private String url;
    /**
     * 当前级别
     */
    private int level;
    /**
     * 父级id
     */
    private int parentId;
    /**
     * 当前目录级别下的子菜单
     */
    private Set<Resource> children;
}
