package zysy.iflytek.coursedemo.edu.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import zysy.iflytek.coursedemo.sys.entity.Teacher;

@Data
@EqualsAndHashCode(callSuper = true)
public class CourseTeacherVO extends CourseVO {
    private static final long serialVersionUID = 1L;
    private Teacher teacher;
}
