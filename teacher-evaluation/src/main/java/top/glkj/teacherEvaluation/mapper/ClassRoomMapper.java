package top.glkj.teacherEvaluation.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.glkj.teacherEvaluation.bean.ClassRoom;


import java.util.List;

/**
 * @author ：瞿嘉
 * @date ：Created in 2020/9/18 9:28
 */
@Mapper
public interface ClassRoomMapper {
    /**
     * 获取所有班级（无条件获取）
     * @return ClassRoom对象
     */
    public List<ClassRoom> getAllClassRoom();

    /**
     *
     * @param id 根据ID获取ClassRoom对象
     * @returnClassRoom对象
     */
    public List<ClassRoom> getClassRoomById(int id);

    /**
     *
     * @param classroom 判断插入数据是否成功
     * @return turn or false
     */
    boolean addClassRoom(ClassRoom classroom);

    /**
     *
     * @param classroom 判断修改数据是否成功
     * @return turn or false
     */
    boolean updateClassRoomById(ClassRoom classroom);

    /**
     * 删除
     * @param id id
     * @return turn or false
     */
    boolean deleteClassRoom(int id);

}
