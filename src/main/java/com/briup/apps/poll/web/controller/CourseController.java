/**
 * Project Name:poll
 * File Name:CourseController.java
 * Package Name:com.briup.apps.poll.web.controller
 * Date:2018年6月10日下午11:15:48
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClassName:CourseController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月10日 下午11:15:48 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Api(description="课程相关API接口")
@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;
	
	@ApiOperation(value="通过id删除课程信息")
	@GetMapping(value="deleteById")
	public MsgResponse deleteById(@RequestParam long id) {
		try {
			courseService.deleteById(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			return MsgResponse.fail("删除失败", null);
		}
	}
	
	@ApiOperation(value="批量删除课程信息")
	@PostMapping(value="batchDelete")
	public MsgResponse batchDelete(@RequestParam long[] ids) {
		try {
			courseService.batchDelete(ids);
			return MsgResponse.success("批量删除成功", null);
		} catch (Exception e) {
			return MsgResponse.fail("批量删除失败", null);
		}
	}
	
	@ApiOperation(value="保存或更新课程信息，如果参数中id不为空表示更新操作，否则表示保存操作")
	@PostMapping(value="saveOrUpdate")
	public MsgResponse saveOrUpdate(@ModelAttribute Course course) {
		try {
			courseService.saveOrUpdate(course);
			return MsgResponse.success("保存或更新成功", null);
		} catch (Exception e) {
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation(value="查询所有课程信息")
	@GetMapping(value="findAll")
	public MsgResponse findAll() {
		try {
			List<Course> list = courseService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			return MsgResponse.fail("error", null);
		}
	}
	
	
	@ApiOperation(value="通过id查找课程信息")
	@GetMapping(value="findById")
	public MsgResponse findById(@RequestParam long id) {
		try {
			Course course = courseService.findById(id);
			return MsgResponse.success("success", course);
		} catch (Exception e) {
			return MsgResponse.fail("error", null);
		}
	}
}

