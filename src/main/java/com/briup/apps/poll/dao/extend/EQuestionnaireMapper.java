/**
 * Project Name:poll
 * File Name:EQuestionnaireMapper.java
 * Package Name:com.briup.apps.poll.dao.extend
 * Date:2018年6月12日下午8:36:34
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.dao.extend;
/**
 * ClassName:EQuestionnaireMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 下午8:36:34 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import com.briup.apps.poll.vm.QuestionnaireVM;

public interface EQuestionnaireMapper {
	QuestionnaireVM findQuestionnaireVMById(long id);
}

