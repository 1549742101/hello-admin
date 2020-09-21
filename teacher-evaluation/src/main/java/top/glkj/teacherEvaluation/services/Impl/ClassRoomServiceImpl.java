package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.ClassRoom;
import top.glkj.teacherEvaluation.mapper.ClassRoomMapper;
import top.glkj.teacherEvaluation.services.ClassRoomService;


import java.util.List;

/**
 * @author ：瞿嘉
 * @date ：Created in 2020/9/18 9:36
 */
@Service
public class ClassRoomServiceImpl implements ClassRoomService {
    @Autowired
   ClassRoomMapper classRoomMapper;

    /**
     * 获取所有班级（无条件获取）
     *
     * @return ClassRoom对象
     */
    @Override
    public List<ClassRoom> getAllClassRoom() {
        return classRoomMapper.getAllClassRoom();
    }

    /**
     * @param id 根据ID获取ClassRoom对象
     * @returnClassRoom对象
     */
    @Override
    public List<ClassRoom> getClassRoomById(int id) {
        return classRoomMapper.getClassRoomById(id);
    }

    /**
     * @param classroom 判断插入数据是否成功
     * @return turn or false
     */
    @Override
    public boolean addClassRoom(ClassRoom classroom) {
        return classRoomMapper.addClassRoom(classroom);
    }

    /**
     * @param classroom 判断修改数据是否成功
     * @return turn or false
     */
    @Override
    public boolean updateClassRoomById(ClassRoom classroom) {
        return classRoomMapper.updateClassRoomById(classroom);
    }

    /**
     * 删除
     *
     * @param id id
     * @return turn or false
     */
    @Override
    public boolean deleteClassRoom(int id) {
        return classRoomMapper.deleteClassRoom(id);
    }
}
