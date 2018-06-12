/**
 * Project Name:poll
 * File Name:ClazzController.java
 * Package Name:com.briup.apps.poll.web.controller
 * Date:2018年6月10日下午11:15:39
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

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.service.IClazzService;
import com.briup.apps.poll.util.MsgResponse;
import com.briup.apps.poll.vm.ClazzVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClassName:ClazzController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月10日 下午11:15:39 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Api( description="班级相关API")
@RestController
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	private IClazzService clazzService;
	
	
	@ApiOperation("通过id删除班级")
	@GetMapping("deleteById")
	public MsgResponse deleteById(@RequestParam long id) {
		try {
			clazzService.deleteById(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation("批量删除班级")
	@PostMapping("batchDelete")
	public MsgResponse batchDelete(@RequestParam long[] ids) {
		try {
			clazzService.batchDelete(ids);
			return MsgResponse.success("批量删除成功", null);
		} catch (Exception e) {
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation("保存或更新班级")
	@PostMapping("saveOrUpdate")
	public MsgResponse saveOrUpdate(@ModelAttribute Clazz clazz) {
		try {
			clazzService.saveOrUpdate(clazz);
			return MsgResponse.success("保存或者更新成功", null);
		} catch (Exception e) {
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation("通过id查询班级")
	@GetMapping("findById")
	public MsgResponse findById(@RequestParam long id) {
		try {
			Clazz clazz = clazzService.findById(id);
			return MsgResponse.success("success", clazz);
		} catch (Exception e) {
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation(value="通过id查询班级",notes="级联查询所属年级，班主任老师信息")
	@GetMapping("findVMById")
	public MsgResponse findVMById(@RequestParam long id) {
		try {
			ClazzVM cvm = clazzService.findVMById(id);
			return MsgResponse.success("success", cvm);
		} catch (Exception e) {
			return MsgResponse.fail("error", null);
		}
	}
	
	
	@ApiOperation("查询所有班级")
	@GetMapping("findAll")
	public MsgResponse findAll() {
		try {
			List<Clazz> list = clazzService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO: handle exception
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation("查询所有班级模型，级联所属年级，班主任")
	@GetMapping("findAllVM")
	public MsgResponse findAllVM() {
		try {
			List<ClazzVM> list = clazzService.findAllVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO: handle exception
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
}

