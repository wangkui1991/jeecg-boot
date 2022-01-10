package org.jeecg.modules.demo.course.mapper;

import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.demo.course.entity.CourseCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 课程分类
 * @Author: jeecg-boot
 * @Date:   2022-01-10
 * @Version: V1.0
 */
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {

	/**
	 * 编辑节点状态
	 * @param id
	 * @param status
	 */
	void updateTreeNodeStatus(@Param("id") String id,@Param("status") String status);

}
