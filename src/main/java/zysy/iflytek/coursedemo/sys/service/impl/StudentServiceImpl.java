package zysy.iflytek.coursedemo.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import zysy.iflytek.coursedemo.sys.entity.Student;
import zysy.iflytek.coursedemo.sys.mapper.IStudentMapper;
import zysy.iflytek.coursedemo.sys.service.IStudentService;
import zysy.iflytek.coursedemo.vo.StudentCourseVO;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YinDehua
 * @since 2023-03-07
 */
@Service
public class StudentServiceImpl extends ServiceImpl<IStudentMapper, Student> implements IStudentService {

    @Override
    public List<Student> SelectStudentList() {
        return baseMapper.SelectStudentList();
    }

    @Override
    public int insertOne(Student student) {
        return baseMapper.insertOne(student);
    }

    @Override
    public Student selectById(Student student) {
        return baseMapper.selectById(student);
    }

    @Override
    public int deleteById(Student student) {
        return baseMapper.deleteById(student);
    }

    @Override
    public int UpdateById(Student student) {
        return baseMapper.UpdateById(student);
    }

    @Override
    public List<StudentCourseVO> getCourseList(Student student) {
        return baseMapper.courseList(student.getId());
    }
}
