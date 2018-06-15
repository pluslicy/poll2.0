/**
 * Project Name:poll
 * File Name:IQuestionnaireService.java
 * Package Name:com.briup.apps.poll.service
 * Date:2018年6月12日下午8:34:43
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service;
/**
 * ClassName:IQuestionnaireService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 下午8:34:43 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import java.util.List;

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.vm.QuestionnaireVM;

public interface IQuestionnaireService {
	/**
	 * 查询所有问卷信息
	 * */
	List<Questionnaire> findAll() throws Exception;
	
	/**
	 * 通过id查询问卷模型
	 * */
	QuestionnaireVM findVMById(long id) throws Exception;
	
	/**
	 * 批量删除问卷信息
	 * */
	void batchDelete(long[] ids) throws Exception;
	
	/**
	 * 通过id删除问卷
	 * */
	void deleteById(long id) throws Exception;
	
	/**
	 * 保存或更新问卷信息
	 * */
	void saveOrUpdate(QuestionnaireVM qnVM) throws Exception;
}

