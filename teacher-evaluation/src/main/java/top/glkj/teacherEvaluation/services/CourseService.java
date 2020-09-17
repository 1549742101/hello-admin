package top.glkj.teacherEvaluation.services;

import top.glkj.teacherEvaluation.bean.Course;

import java.util.List;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/17 9:09
 */
public interface CourseService {

    /**
     * 获取所有科目（无条件获取）
     * @return Course对象
     */
    public List<Course> getAllCourse();

    /**
     * 根据科目id查询 Course（科目）
     * @param id 传入id
     * @return Course对象
     */
    public List<Course> getCourseById(int id);
}
