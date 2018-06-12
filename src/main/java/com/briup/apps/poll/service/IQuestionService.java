/**
 * Project Name:poll
 * File Name:IQuestionService.java
 * Package Name:com.briup.apps.poll.service
 * Date:2018年6月12日上午11:05:20
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service;
/**
 * ClassName:IQuestionService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 上午11:05:20 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import java.util.List;

import com.briup.apps.poll.vm.QuestionVM;

public interface IQuestionService {
	List<QuestionVM> queryVM(String keywords) throws Exception;
	
	List<QuestionVM> findAllVM() throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void batchDelete(long[] ids) throws Exception;
	
	void saveOrUpdateVM(QuestionVM questionVM) throws Exception;
}

