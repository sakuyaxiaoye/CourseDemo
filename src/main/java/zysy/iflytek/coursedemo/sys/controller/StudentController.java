package zysy.iflytek.coursedemo.sys.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import zysy.iflytek.coursedemo.sys.entity.Student;
import zysy.iflytek.coursedemo.sys.service.IStudentService;
import zysy.iflytek.coursedemo.vo.StudentCourseVO;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YinDehua
 * @since 2023-03-07
 */
@RestController
@AllArgsConstructor
@RequestMapping("/sys/student")
public class StudentController {
    private IStudentService istudentService;
    @GetMapping("/courselist")
    public List<StudentCourseVO> courseList(Student student) {

       /* List<Student> list = istudentService.SelectStudentList();
        for (Student student : list) {
            System.out.println(student);
        }*/
        List<StudentCourseVO> list = istudentService.getCourseList(student);
        return list;
    }

    @GetMapping("/list")
    public List<Student> List() {

       List<Student> list = istudentService.SelectStudentList();

        return list;
    }

    @PostMapping("/add")
    @ApiOperation(value = "新增",notes = "传入student")
    public int insertOne(@Valid @RequestBody Student student) {
        int one =istudentService.insertOne(student);
        return one;
    }

    @PostMapping("/select")
    public Student selectOne(Student student){
        Student student1 = istudentService.selectById(student);
        return student1;
    }
    @PostMapping("/delete")
    public int deleteById(Student student){
        int de=istudentService.deleteById(student);
        return de;
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改",notes = "传入student")
    public  int updateById(@RequestBody Student student){
        int up = istudentService.UpdateById(student);
        return up;
    }
    @GetMapping("/pageTest")
    IPage<Student> pageTest() {
        return istudentService.page(Page.of(2,1));
    }

    @GetMapping("/page")
    IPage<Student> page(@Param("student")Student student, Page<Student> page) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().like(Student::getUserName, student.getUserName());

        return istudentService.page(page, queryWrapper);
    }
    @PostMapping("/submit")
    @ApiOperation(value = "新增或修改",notes = "传入student")
    public boolean submit(@Valid @ RequestBody Student student){
        return istudentService.saveOrUpdate(student);
    }

}

