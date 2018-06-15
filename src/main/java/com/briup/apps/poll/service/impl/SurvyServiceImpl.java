/**
 * Project Name:poll
 * File Name:SurvyServiceImpl.java
 * Package Name:com.briup.apps.poll.service.impl
 * Date:2018年6月14日下午4:26:17
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.dao.extend.ESurvyMapper;
import com.briup.apps.poll.service.ISurvyService;
import com.briup.apps.poll.vm.SurvyVM;

/**
 * ClassName:SurvyServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月14日 下午4:26:17 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service
public class SurvyServiceImpl implements ISurvyService {
	@Autowired
	private ESurvyMapper eSurvyMapper;
	@Override
	public List<SurvyVM> findAllSurvyVM() throws Exception {
		return eSurvyMapper.findAllSurvyVM();
	}

}

