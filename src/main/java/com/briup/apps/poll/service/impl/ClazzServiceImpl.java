/**
 * Project Name:poll
 * File Name:ClazzServiceImpl.java
 * Package Name:com.briup.apps.poll.service.impl
 * Date:2018年6月10日下午11:14:11
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.ClazzExample;
import com.briup.apps.poll.dao.ClazzMapper;
import com.briup.apps.poll.dao.extend.EClazzMapper;
import com.briup.apps.poll.service.IClazzService;
import com.briup.apps.poll.vm.ClazzVM;

/**
 * ClassName:ClazzServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月10日 下午11:14:11 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service
public class ClazzServiceImpl implements IClazzService {
	@Autowired
	private ClazzMapper clazzMapper;
	@Autowired
	private EClazzMapper eClazzMapper;
	
	@Override
	public List<Clazz> findAll() throws Exception {
		ClazzExample example = new ClazzExample();
		return clazzMapper.selectByExample(example);
	}

	@Override
	public Clazz findById(long id) throws Exception {
		return clazzMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveOrUpdate(Clazz clazz) throws Exception {
		if(clazz.getId()!=null) {
			clazzMapper.updateByPrimaryKey(clazz);
		} else {
			clazzMapper.insert(clazz);
		}
	}

	@Override
	public void deleteById(long id) throws Exception {
		clazzMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDelete(long[] ids) throws Exception {
		for(long id : ids) {
			clazzMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public ClazzVM findVMById(long id) throws Exception {
		return eClazzMapper.findClazzVMById(id);
	}

	@Override
	public List<ClazzVM> findAllVM() throws Exception {
		return eClazzMapper.findAllClazzVM();
	}
}

