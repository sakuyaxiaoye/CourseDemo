package zysy.iflytek.coursedemo.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import zysy.iflytek.coursedemo.edu.entity.Course;
import zysy.iflytek.coursedemo.edu.mapper.ICourseMapper;
import zysy.iflytek.coursedemo.edu.service.ICourseService;
import zysy.iflytek.coursedemo.edu.vo.CourseTeacherVO;
import zysy.iflytek.coursedemo.edu.vo.CourseVO;

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
public class CourseServiceImpl extends ServiceImpl<ICourseMapper, Course> implements ICourseService {

    @Override
    public List<Course> list() {
        return baseMapper.list();
    }
    @Override
    public List<CourseTeacherVO> listTeacherVO() {
        return baseMapper.listTeacherVO();
    }

    /*@Override
    public List<CourseVO> listVO() {
        return baseMapper.listVO();
    }*/
}
