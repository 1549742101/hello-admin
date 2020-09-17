package top.glkj.teacherEvaluation.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.glkj.teacherEvaluation.bean.Course;
import top.glkj.teacherEvaluation.mapper.CourseMapper;
import top.glkj.teacherEvaluation.services.CourseService;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/17 9:10
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;
    /**
     * 获取所有科目（无条件获取）
     *
     * @return Course对象
     */
    @Override
    public List<Course> getAllCourse() {
        return courseMapper.getAllCourse();
    }

    /**
     * 根据科目id查询 Course（科目）
     *
     * @param id 传入id
     * @return Course对象
     */
    @Override
    public List<Course> getCourseById(int id) {
        return courseMapper.getCourseById(id);
    }
}
