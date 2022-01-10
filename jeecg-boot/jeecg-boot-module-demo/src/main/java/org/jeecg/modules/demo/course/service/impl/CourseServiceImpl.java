package org.jeecg.modules.demo.course.service.impl;

import org.jeecg.modules.demo.course.entity.Course;
import org.jeecg.modules.demo.course.mapper.CourseMapper;
import org.jeecg.modules.demo.course.service.ICourseService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 课程
 * @Author: jeecg-boot
 * @Date:   2022-01-10
 * @Version: V1.0
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

}
