package zysy.iflytek.coursedemo.edu.mapper;

import zysy.iflytek.coursedemo.edu.entity.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import zysy.iflytek.coursedemo.edu.vo.CourseTeacherVO;
import zysy.iflytek.coursedemo.edu.vo.CourseVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YinDehua
 * @since 2023-03-07
 */
public interface ICourseMapper extends BaseMapper<Course> {
    List<Course> list();

   /* List<CourseVO> listVO();*/

    List<CourseTeacherVO> listTeacherVO();
}
