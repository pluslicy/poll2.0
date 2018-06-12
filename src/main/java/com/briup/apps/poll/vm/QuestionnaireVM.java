/**
 * Project Name:poll
 * File Name:QuestionnaireVM.java
 * Package Name:com.briup.apps.poll.vm
 * Date:2018年6月12日下午8:37:29
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.vm;
/**
 * ClassName:QuestionnaireVM <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 下午8:37:29 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
// 问卷模型类

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="问卷模型")
public class QuestionnaireVM {
	@ApiModelProperty(value="问卷编号")
    private Long id;
	@ApiModelProperty(value="问卷名称")
    private String name;
	@ApiModelProperty(value="问卷创建时间")
    private String createdate;
	@ApiModelProperty(value="问卷描述")
    private String description;
	
	@ApiModelProperty(value="问题列表")
	private List<QuestionVM> questionVMs;

	public List<QuestionVM> getQuestionVMs() {
		return questionVMs;
	}

	public void setQuestionVMs(List<QuestionVM> questionVMs) {
		this.questionVMs = questionVMs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

