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

import com.briup.apps.poll.bean.Option;
import com.briup.apps.poll.bean.OptionExample;
import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.dao.OptionMapper;
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
	@Autowired
	private OptionMapper optionMapper;
	
	@Override
	public List<QuestionVM> findAllVM() throws Exception {
		return eQuestionMapper.findAllQuestionVM();
	}
	
	/**
	 * 保存或者更新题目信息，级联更新选项
	 * */
	@Override
	public void saveOrUpdateVM(QuestionVM questionVM) throws Exception {
		//拆解对象
		// 题目对象
		Question question = new Question();
		question.setId(questionVM.getId());
		question.setTitle(questionVM.getTitle());
		question.setNo(questionVM.getNo());
		question.setQuestiontypeid(questionVM.getQuestiontypeid());
		question.setQuestiontypelabel(questionVM.getQuestiontypelabel());
		// 题目关联的选项对象
		List<Option> options = questionVM.getOptions();
		if(questionVM.getId()!=null) {
			//修改操作
			//1. 修改题干信息
			questionMapper.updateByPrimaryKey(question);
			//2. 删除原来题干所对应的选项信息
			OptionExample oe = new OptionExample();
			oe.createCriteria().andQuestionIdEqualTo(question.getId());
			optionMapper.deleteByExample(oe);
			//3. 插入新来的题干信息
			for(Option option : options) {
				option.setId(null);
				optionMapper.insert(option);
			}
		} else {
			//保存操作
			//1.插入题干信息，需要在mapper中设定，返回id <insert id="insert" parameterType="com.briup.apps.poll.bean.Question" useGeneratedKeys="true" keyProperty="id">
			questionMapper.insert(question);
			//2.插入选项信息
			for(Option option : options) {
				option.setQuestionId(question.getId());
				optionMapper.insert(option);
			}
		}
	}
	
	// 通过ID删除
	@Override
	public void deleteById(long id) throws Exception {
		questionMapper.deleteByPrimaryKey(id);
	}
	
	//批量删除
	@Override
	public void batchDelete(long[] ids) throws Exception {
		for(long id : ids) {
			questionMapper.deleteByPrimaryKey(id);
		}
	}

	//模糊查询
	@Override
	public List<QuestionVM> queryVM(String keywords) throws Exception {
		return eQuestionMapper.queryQuestionVM(keywords);
	}

}

