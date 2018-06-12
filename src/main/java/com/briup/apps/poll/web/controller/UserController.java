/**
 * Project Name:poll
 * File Name:UserController.java
 * Package Name:com.briup.apps.poll.web.controller
 * Date:2018年6月12日上午9:09:17
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

import com.briup.apps.poll.bean.User;
import com.briup.apps.poll.service.IUserService;
import com.briup.apps.poll.util.MsgResponse;
import com.briup.apps.poll.vm.UserVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClassName:UserController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 上午9:09:17 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Api(description="用户相关API")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@ApiOperation("通过Id删除用户信息")
	@GetMapping("deleteById")
	public MsgResponse deleteById(@RequestParam long id) {
		try {
			userService.deleteById(id);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation("批量删除用户信息")
	@PostMapping("batchDelete")
	public MsgResponse batchDelete(@RequestParam long[] ids) {
		try {
			userService.batchDelete(ids);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation("保存或更新用户信息")
	@PostMapping("saveOrUpdate")
	public MsgResponse saveOrUpdate(@ModelAttribute User user) {
		try {
			userService.saveOrUpdate(user);
			return MsgResponse.success("success", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation("查询所有用户模型，级联查询该用户所在年级")
	@GetMapping("findAllVM")
	public MsgResponse findAllVM() {
		try {
			List<UserVM> list = userService.findAllVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
	
	@ApiOperation("查询所有用户模型")
	@GetMapping("findAll")
	public MsgResponse findAll() {
		try {
			List<User> list = userService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.fail(e.getMessage(), null);
		}
	}
}

