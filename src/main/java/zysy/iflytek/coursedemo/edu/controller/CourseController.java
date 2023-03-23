package zysy.iflytek.coursedemo.edu.controller;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zysy.iflytek.coursedemo.edu.entity.Course;
import zysy.iflytek.coursedemo.edu.service.ICourseService;
import zysy.iflytek.coursedemo.edu.vo.CourseTeacherVO;

import javax.validation.Valid;
import java.util.ArrayList;
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
@RequestMapping("/edu/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    /*@GetMapping("/list")
    public List<Course> list(){
        return courseService.list();
    }*/
    @GetMapping("list")
    public Page list(Page<Course> page){
        return courseService.page(page);
    }

    @PostMapping("/submit")
    @ApiOperation(value = "新增或修改",notes = "传入course")
    public boolean submit(@Valid @RequestBody Course course){
        return courseService.saveOrUpdate(course);
    }

    @GetMapping("/listTeacherVO")
    public List<CourseTeacherVO> listTeacherVO(){
        return courseService.listTeacherVO();
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除",notes = "传入courseId")
    public boolean delete(@ApiParam(value = "主键集合", required = true) @RequestParam String ids){
        if (StringUtils.isEmpty(ids)) {
            return true;
        }
        String[] idArr = ids.split(",");
        List<Integer> idList = new ArrayList<>();
        for (String id : idArr) {
            idList.add(NumberUtils.toInt(id));
        }
        return courseService.removeByIds(idList);
    }



}

