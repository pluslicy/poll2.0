/**
 * Project Name:poll
 * File Name:SurvyController.java
 * Package Name:com.briup.apps.poll.web.controller
 * Date:2018年6月14日下午4:28:25
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.service.ISurvyService;
import com.briup.apps.poll.util.MsgResponse;
import com.briup.apps.poll.vm.SurvyVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClassName:SurvyController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月14日 下午4:28:25 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Api(description="课调相关API")
@RestController
@RequestMapping("/survy")
public class SurvyController {
	@Autowired
	private ISurvyService survyService;
	
	@ApiOperation(value="查询所有课调信息")
	@GetMapping("findAllSurvyVM")
	public MsgResponse findAllSurvyVM() {
		try {
			List<SurvyVM> list = survyService.findAllSurvyVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
}

