package top.glkj.teacherEvaluation.mapper;

import top.glkj.teacherEvaluation.bean.Course;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/17 9:07
 */
public interface CourseMapper {
    /**
     * 获取所有科目（无条件获取）
     * @return Course对象
     */
    public Course getAllCourse();

    /**
     * 根据科目id查询 Course（科目）
     * @param id 传入id
     * @return Course对象
     */
    public Course getCourseById(int id);

}
