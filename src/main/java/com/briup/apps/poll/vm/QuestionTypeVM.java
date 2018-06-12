/**
 * Project Name:poll
 * File Name:QuestionTypeVM.java
 * Package Name:com.briup.apps.poll.vm
 * Date:2018年6月12日上午11:32:58
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.vm;
/**
 * ClassName:QuestionTypeVM <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 上午11:32:58 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class QuestionTypeVM {
	private Long id;  
	private String questionTypeName;	//英文  
    private String questionTypeLabel;	//中文
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestionTypeName() {
		return questionTypeName;
	}
	public void setQuestionTypeName(String questionTypeName) {
		this.questionTypeName = questionTypeName;
	}
	public String getQuestionTypeLabel() {
		return questionTypeLabel;
	}
	public void setQuestionTypeLabel(String questionTypeLabel) {
		this.questionTypeLabel = questionTypeLabel;
	}
}

