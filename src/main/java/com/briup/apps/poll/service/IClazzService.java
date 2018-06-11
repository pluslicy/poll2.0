/**
 * Project Name:poll
 * File Name:IClazzService.java
 * Package Name:com.briup.apps.poll.service
 * Date:2018年6月10日下午11:13:21
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.vm.ClazzVM;

/**
 * ClassName:IClazzService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月10日 下午11:13:21 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface IClazzService {
	List<Clazz> findAll() throws Exception;
	
	Clazz findById(long id) throws Exception;
	
	ClazzVM findVMById(long id) throws Exception;
	
	List<ClazzVM> findAllVM() throws Exception;
	
	void saveOrUpdate(Clazz grade) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void batchDelete(long[] ids) throws Exception;
	
	
}

