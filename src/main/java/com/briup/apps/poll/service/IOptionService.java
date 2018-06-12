/**
 * Project Name:poll
 * File Name:IOptionService.java
 * Package Name:com.briup.apps.poll.service
 * Date:2018年6月12日下午12:09:32
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service;

import com.briup.apps.poll.bean.Option;

/**
 * ClassName:IOptionService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 下午12:09:32 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface IOptionService {
	void deleteById(long id) throws Exception;
	
	void batchDelete(long[] ids) throws Exception;
	
	void saveOrUpdate(Option option ) throws Exception;
}

