package zysy.iflytek.coursedemo.edu.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import zysy.iflytek.coursedemo.edu.entity.Course;

@Data
@EqualsAndHashCode(callSuper = false)
public class CourseVO extends Course {
    private static final long serialVersionUID = 1L;

    private String teacherName;
}
