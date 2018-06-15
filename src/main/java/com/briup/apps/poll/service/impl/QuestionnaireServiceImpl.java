/**
 * Project Name:poll
 * File Name:QuestionnaireServiceImpl.java
 * Package Name:com.briup.apps.poll.service.impl
 * Date:2018年6月12日下午8:35:02
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.bean.QuestionnaireExample;
import com.briup.apps.poll.bean.QuestionnaireQuestion;
import com.briup.apps.poll.bean.QuestionnaireQuestionExample;
import com.briup.apps.poll.dao.QuestionnaireMapper;
import com.briup.apps.poll.dao.QuestionnaireQuestionMapper;
import com.briup.apps.poll.dao.extend.EQuestionnaireMapper;
import com.briup.apps.poll.service.IQuestionnaireService;
import com.briup.apps.poll.vm.QuestionVM;
import com.briup.apps.poll.vm.QuestionnaireVM;

/**
 * ClassName:QuestionnaireServiceImpl <br/>
 * Function: 问卷服务类. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 下午8:35:02 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {
	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	@Autowired
	private EQuestionnaireMapper eQuestionnaireMapper;
	@Autowired
	private QuestionnaireQuestionMapper qnqMapper;
	
	@Override
	public List<Questionnaire> findAll() throws Exception{
		QuestionnaireExample example = new QuestionnaireExample();
		return questionnaireMapper.selectByExample(example);
	}
	
	@Override
	public QuestionnaireVM findVMById(long id) throws Exception{
		return eQuestionnaireMapper.findQuestionnaireVMById(id);
	}

	@Override
	public void deleteById(long id) throws Exception {
		questionnaireMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void saveOrUpdate(QuestionnaireVM qnVM) throws Exception {
		//1. 分解出问卷对象 
		Questionnaire qn = new Questionnaire();
		qn.setId(qnVM.getId());
		qn.setCreatedate(qnVM.getCreatedate());
		qn.setDescription(qnVM.getDescription());
		qn.setName(qnVM.getName());
		//2. 分解出问题对象列表
		List<QuestionVM> qs = qnVM.getQuestionVMs();
		if(qn.getId()!=null) {
			//3.1. 修改操作
			//3.1.1 更新问卷的基本信息
			questionnaireMapper.updateByPrimaryKey(qn);
			//3.1.2 删除该问卷中的桥表信息
			QuestionnaireQuestionExample qnqExample = new QuestionnaireQuestionExample();
			qnqExample.createCriteria().andQuestionnaireIdEqualTo(qn.getId());
			qnqMapper.deleteByExample(qnqExample);
			//3.1.3 重新舍子问卷中的桥表关系
			for(QuestionVM q : qs) {
				QuestionnaireQuestion qnq = new QuestionnaireQuestion();
				qnq.setQuestionnaireId(qn.getId());
				qnq.setQuestionId(q.getId());
				qnqMapper.insert(qnq);
			}
		} else {
			//3.2. 保存操作
			//3.2.1 保存问卷信息
			questionnaireMapper.insert(qn);
			//3.2.2 封装桥表对象，保存桥表信息
			for(QuestionVM q : qs) {
				QuestionnaireQuestion qnq = new QuestionnaireQuestion();
				qnq.setQuestionnaireId(qn.getId());
				qnq.setQuestionId(q.getId());
				qnqMapper.insert(qnq);
			}
		}
		
	}

	@Override
	public void batchDelete(long[] ids) throws Exception {
		for(long id : ids) {
			questionnaireMapper.deleteByPrimaryKey(id);
		}
	}
	
	
}

