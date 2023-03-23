package zysy.iflytek.coursedemo.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import zysy.iflytek.coursedemo.edu.entity.Course;
import zysy.iflytek.coursedemo.sys.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class StudentCourseVO extends Student {
    private static final long serialVersionUID = 1L;

    List<Course> courseList;

    public List<Course> getCourseList() {
        if (null == courseList) {
            courseList = new ArrayList<>();
        }
        return courseList;
    }
}
