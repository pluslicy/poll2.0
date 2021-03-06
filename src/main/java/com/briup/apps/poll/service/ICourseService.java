/**
 * Project Name:poll
 * File Name:ICourseService.java
 * Package Name:com.briup.apps.poll.service
 * Date:2018年6月10日下午11:13:31
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Course;

/**
 * ClassName:ICourseService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月10日 下午11:13:31 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface ICourseService {

	List<Course> findAll() throws Exception;
	
	Course findById(long id) throws Exception;
	
	void saveOrUpdate(Course course) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void batchDelete(long[] ids) throws Exception;
}

