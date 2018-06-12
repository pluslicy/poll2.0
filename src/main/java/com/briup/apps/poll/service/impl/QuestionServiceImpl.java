/**
 * Project Name:poll
 * File Name:QuestionServiceImpl.java
 * Package Name:com.briup.apps.poll.service.impl
 * Date:2018年6月12日上午11:05:32
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.dao.QuestionMapper;
import com.briup.apps.poll.dao.extend.EQuestionMapper;
import com.briup.apps.poll.service.IQuestionService;
import com.briup.apps.poll.vm.QuestionVM;

/**
 * ClassName:QuestionServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 上午11:05:32 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service
public class QuestionServiceImpl implements IQuestionService {
	@Autowired
	private EQuestionMapper eQuestionMapper;
	@Autowired
	private QuestionMapper questionMapper;
	
	@Override
	public List<QuestionVM> findAllVM() throws Exception {
		return eQuestionMapper.findAllQuestionVM();
	}
	
	/**
	 * 保存或者更新题目信息，级联更新选项
	 * */
	@Override
	public void saveOrUpdateVM(QuestionVM questionVM) throws Exception {
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		questionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDelete(long[] ids) throws Exception {
		for(long id : ids) {
			questionMapper.deleteByPrimaryKey(id);
		}
	}

}

