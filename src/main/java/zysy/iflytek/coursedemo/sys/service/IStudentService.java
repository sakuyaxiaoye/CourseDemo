package zysy.iflytek.coursedemo.sys.service;

import org.apache.catalina.User;
import zysy.iflytek.coursedemo.sys.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import zysy.iflytek.coursedemo.vo.StudentCourseVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YinDehua
 * @since 2023-03-07
 */
public interface IStudentService extends IService<Student> {

    List<Student> SelectStudentList();

     int insertOne(Student student);

    Student selectById(Student student);

    int deleteById(Student student);

    int UpdateById(Student student);

    List<StudentCourseVO> getCourseList(Student student);
}
