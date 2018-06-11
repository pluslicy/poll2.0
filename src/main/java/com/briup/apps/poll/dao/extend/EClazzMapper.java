/**
 * Project Name:poll
 * File Name:EClazzMapper.java
 * Package Name:com.briup.apps.poll.dao.extend
 * Date:2018年6月11日下午9:20:25
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.dao.extend;
/**
 * ClassName:EClazzMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月11日 下午9:20:25 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import java.util.List;
import com.briup.apps.poll.vm.ClazzVM;

public interface EClazzMapper {
	List<ClazzVM> findAllClazzVM() throws Exception;
	
	ClazzVM findClazzVMById(long id) throws Exception;
}

