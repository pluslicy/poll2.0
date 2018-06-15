/**
 * Project Name:poll
 * File Name:QuestionnaireController.java
 * Package Name:com.briup.apps.poll.web.controller
 * Date:2018年6月12日下午9:40:05
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

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.service.IQuestionnaireService;
import com.briup.apps.poll.util.MsgResponse;
import com.briup.apps.poll.vm.QuestionnaireVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClassName:QuestionnaireController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 下午9:40:05 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Api(description="问卷相关API")
@RestController
@RequestMapping("/qn")
public class QuestionnaireController {
	@Autowired
	private IQuestionnaireService questionnaireService;
	
	@ApiOperation(value="保存或更新问卷信息,保存功能已经实现",notes="只需要传递问卷的基本信息和问卷中个问题的id即可")
	@PostMapping(value="saveOrUpdate")
	public MsgResponse saveOrUpdate(@ModelAttribute QuestionnaireVM qnVM) {
		try {
			questionnaireService.saveOrUpdate(qnVM);
			return MsgResponse.success("保存或更新成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation(value="批量删除问卷信息")
	@PostMapping(value="batchDelete")
	public MsgResponse batchDelete(@RequestParam long[] ids) {
		try {
			questionnaireService.batchDelete(ids);
			return MsgResponse.success("批量删除成功", null);
		} catch (Exception e) {
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation(value="通过id查询删除问卷")
	@GetMapping("deleteQnById")
	public MsgResponse deleteQnById(@RequestParam long id) {
		try {
			questionnaireService.deleteById(id);
			return MsgResponse.success("成功删除问卷", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	

	@ApiOperation(value="查询所有问卷信息")
	@GetMapping("findAllQn")
	public MsgResponse findAllQn() {
		try {
			List<Questionnaire> list = questionnaireService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation(value="通过id查询问卷模型")
	@GetMapping("findQnVMById")
	public MsgResponse findQnVMById(@RequestParam long id) {
		try {
			QuestionnaireVM vm = questionnaireService.findVMById(id);
			return MsgResponse.success("success", vm);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
}

