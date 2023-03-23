package zysy.iflytek.coursedemo.sys.mapper;

import org.apache.ibatis.annotations.Param;
import zysy.iflytek.coursedemo.sys.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import zysy.iflytek.coursedemo.vo.StudentCourseVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YinDehua
 * @since 2023-03-07
 */
public interface IStudentMapper extends BaseMapper<Student> {

    List<Student> SelectStudentList();

    int insertOne(Student student);

    Student selectById(Student student);

    int deleteById(Student student);

    int UpdateById(Student student);

    List<StudentCourseVO> courseList(@Param("Id") Integer id);
}
