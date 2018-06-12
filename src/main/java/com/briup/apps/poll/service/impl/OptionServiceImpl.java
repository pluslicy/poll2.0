/**
 * Project Name:poll
 * File Name:OptionServiceImpl.java
 * Package Name:com.briup.apps.poll.service.impl
 * Date:2018年6月12日下午12:12:49
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Option;
import com.briup.apps.poll.dao.OptionMapper;
import com.briup.apps.poll.service.IOptionService;

/**
 * ClassName:OptionServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 下午12:12:49 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service
public class OptionServiceImpl implements IOptionService {
	@Autowired
	private OptionMapper optionMapper;
	
	@Override
	public void deleteById(long id) throws Exception {
		optionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDelete(long[] ids) throws Exception {
		for(long id : ids) {
			optionMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public void saveOrUpdate(Option option) throws Exception {
		
	}

}

