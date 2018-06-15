/**
 * Project Name:poll
 * File Name:ISurvyService.java
 * Package Name:com.briup.apps.poll.service
 * Date:2018年6月14日下午4:25:29
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service;
/**
 * ClassName:ISurvyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月14日 下午4:25:29 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import java.util.List;

import com.briup.apps.poll.vm.SurvyVM;

public interface ISurvyService {
	List<SurvyVM> findAllSurvyVM() throws Exception;
}

