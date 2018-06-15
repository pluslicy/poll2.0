/**
 * Project Name:poll
 * File Name:ESurvyMapper.java
 * Package Name:com.briup.apps.poll.dao.extend
 * Date:2018年6月14日下午4:17:28
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.dao.extend;
/**
 * ClassName:ESurvyMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月14日 下午4:17:28 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import java.util.List;

import com.briup.apps.poll.vm.SurvyVM;

public interface ESurvyMapper {
	// 查询所有课调模型
	List<SurvyVM> findAllSurvyVM();
	// 通过ID查询课调模型
	SurvyVM findById(long id);
}

