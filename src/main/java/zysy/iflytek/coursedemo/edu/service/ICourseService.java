package zysy.iflytek.coursedemo.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zysy.iflytek.coursedemo.edu.entity.Course;
import zysy.iflytek.coursedemo.edu.vo.CourseTeacherVO;
import zysy.iflytek.coursedemo.edu.vo.CourseVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YinDehua
 * @since 2023-03-07
 */
public interface ICourseService extends IService<Course> {

    List<Course> list();

    List<CourseTeacherVO> listTeacherVO();

    /*List<CourseVO> listVO();*/
}
