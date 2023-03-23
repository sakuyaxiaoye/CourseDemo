package zysy.iflytek.coursedemo.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

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
@TableName("sys_teacher")
@ApiModel(value = "Teacher对象", description = "")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("教职工号")
    private String workNo;

    @ApiModelProperty("教师姓名")
    private String name;

    @ApiModelProperty("性别  1男  2女")
    private Boolean sex;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("是否已删除 0-未删除 1-已删除")
    private Boolean isDeleted;


}
