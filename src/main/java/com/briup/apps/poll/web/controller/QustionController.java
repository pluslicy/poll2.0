/**
 * Project Name:poll
 * File Name:QustionController.java
 * Package Name:com.briup.apps.poll.web.controller
 * Date:2018年6月12日上午11:07:55
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.QuestionType;
import com.briup.apps.poll.service.IQuestionService;
import com.briup.apps.poll.util.MsgResponse;
import com.briup.apps.poll.vm.QuestionTypeVM;
import com.briup.apps.poll.vm.QuestionVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClassName:QustionController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 上午11:07:55 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Api(description="题库相关API")
@RestController
@RequestMapping("/question")
public class QustionController {
	@Autowired
	private IQuestionService questionService;
	
	@ApiOperation(value="根据ID删除题目信息")
	@GetMapping(value="deleteById")
	public MsgResponse deleteById(@RequestParam long id) {
		try {
			questionService.deleteById(id);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation(value="批量删除题目信息")
	@PostMapping(value="batchDelete")
	public MsgResponse batchDelete(@RequestParam long[] ids) {
		try {
			questionService.batchDelete(ids);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation(value="保存或更新题目信息,暂未完善")
	@PostMapping(value="saveOrUpdate")
	public MsgResponse saveOrUpdate(@ModelAttribute QuestionVM questionVM) {
		try {
			questionService.saveOrUpdateVM(questionVM);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	
	@ApiOperation(value="查询所有题目类型")
	@GetMapping(value="findAllQuestionType")
	public MsgResponse findAllQuestionType() {
		// 获取所有的题目类型枚举
		QuestionType[] qts = QuestionType.values();
		//将枚举类型转换为对象传递到前端（还要再被转换为json）
		List<QuestionTypeVM> list = new ArrayList<>();
		for(QuestionType qt : qts) {
			QuestionTypeVM vm = new QuestionTypeVM();
			vm.setId((long)qt.getIndex());
			vm.setQuestionTypeName(qt.getName());
			vm.setQuestionTypeLabel(qt.getNameZH());
			list.add(vm);
		}
		return MsgResponse.success("success", list);
	}
	
	@ApiOperation(value="查询所有题目，级联该题目中的所有选项")
	@GetMapping(value="findAllVM")
	public MsgResponse findAllVM() {
		try {
			List<QuestionVM> list = questionService.findAllVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
}

