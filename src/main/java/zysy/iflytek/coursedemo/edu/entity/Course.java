package zysy.iflytek.coursedemo.edu.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author YinDehua
 * @since 2023-03-07
 */
@Getter
@Setter
@TableName("edu_course")
@ApiModel(value = "Course对象", description = "")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("课程号")
    private String courseCno;

    @ApiModelProperty("课程名称")
    private String courseName;

    @ApiModelProperty("父课程id")
    private Integer parentId;

    @ApiModelProperty("教师id")
    private Integer teacherId;

    @ApiModelProperty("计划招收数")
    private Integer recruitsPlan;

    @ApiModelProperty("实际招收数")
    private Integer recruitsActual;

    @ApiModelProperty("已申请数")
    private Integer recruitsRequest;

    @ApiModelProperty("课程有效性（1-上架，2-下架）")
    private Integer isValid;

    @ApiModelProperty("是否已删除 0-未删除 1-已删除")
    private Boolean isDeleted;

    @ApiModelProperty("排序")
    private Integer sort;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("注册时间")
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;


}
