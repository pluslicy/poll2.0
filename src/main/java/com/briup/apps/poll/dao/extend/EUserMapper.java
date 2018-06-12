/**
 * Project Name:poll
 * File Name:EUserMapper.java
 * Package Name:com.briup.apps.poll.dao.extend
 * Date:2018年6月12日上午9:17:12
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.dao.extend;

import java.util.List;

import com.briup.apps.poll.vm.UserVM;

/**
 * ClassName:EUserMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 上午9:17:12 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface EUserMapper {
	List<UserVM> findAllUserVM();
}

