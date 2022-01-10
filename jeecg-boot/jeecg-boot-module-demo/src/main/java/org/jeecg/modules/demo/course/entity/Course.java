package org.jeecg.modules.demo.course.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: 课程
 * @Author: jeecg-boot
 * @Date:   2022-01-10
 * @Version: V1.0
 */
@Data
@TableName("course")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="course对象", description="课程")
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键")
    private java.lang.String id;
	/**创建人*/
    @ApiModelProperty(value = "创建人")
    private java.lang.String createBy;
	/**创建日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建日期")
    private java.util.Date createTime;
	/**更新人*/
    @ApiModelProperty(value = "更新人")
    private java.lang.String updateBy;
	/**更新日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新日期")
    private java.util.Date updateTime;
	/**所属部门*/
    @ApiModelProperty(value = "所属部门")
    private java.lang.String sysOrgCode;
	/**课程名称*/
	@Excel(name = "课程名称", width = 15)
    @ApiModelProperty(value = "课程名称")
    private java.lang.String name;
	/**课程分类*/
	@Excel(name = "课程分类", width = 15, dictTable = "course_category", dicText = "name", dicCode = "id")
	@Dict(dictTable = "course_category", dicText = "name", dicCode = "id")
    @ApiModelProperty(value = "课程分类")
    private java.lang.String category;
	/**课程描述*/
	@Excel(name = "课程描述", width = 15)
    @ApiModelProperty(value = "课程描述")
    private java.lang.String des;
	/**课程封面图*/
	@Excel(name = "课程封面图", width = 15)
    @ApiModelProperty(value = "课程封面图")
    private java.lang.String cover;
	/**测试查询*/
	@Excel(name = "测试查询", width = 15)
    @ApiModelProperty(value = "测试查询")
    private java.lang.Integer test;
}
