/**
 * Project Name:poll
 * File Name:EQuestionMapper.java
 * Package Name:com.briup.apps.poll.dao.extend
 * Date:2018年6月12日上午10:57:41
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.dao.extend;
/**
 * ClassName:EQuestionMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 上午10:57:41 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import java.util.List;

import com.briup.apps.poll.vm.QuestionVM;

public interface EQuestionMapper {
	List<QuestionVM> findAllQuestionVM();
}

