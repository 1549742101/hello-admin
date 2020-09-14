package top.glkj.teacherEvaluation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * 权限表
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/14 8:36
 * | 字段名      | 类型        | 描述     |
 * | ----------- | ----------- | -------- |
 * | id          | int         | 权限标识 |
 * | name        | varchar(20) | 权限名称 |
 * | description | varchar(20) | 权限描述 |
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Permission extends BaseEntity{
    private int id;
    private String perName;
    private String description;
    /**
     * 当前权限下所拥有的资源
     */
    Set<Resource> resources;
}
