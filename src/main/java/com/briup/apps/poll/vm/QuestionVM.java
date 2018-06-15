/**
 * Project Name:poll
 * File Name:QuestionVM.java
 * Package Name:com.briup.apps.poll.vm
 * Date:2018年6月12日上午10:40:38
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.vm;
/**
 * ClassName:QuestionVM <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 上午10:40:38 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import java.util.List;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.bean.Option;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
// 问题模型，级联选项
@ApiModel(description="问题模型")
public class QuestionVM {
	@ApiModelProperty(value="问题编号")
	private Long id;
	
	@ApiModelProperty(value="问题标题",required=true)
	private String title;
	
	@ApiModelProperty(value="问题序号")
	private Integer no;
	
	@ApiModelProperty(value="问题类型编号",required=true)
	private Long questiontypeid;
	
	@ApiModelProperty(value="问题类型名称",required=true)
	private String questiontypelabel;
	
	@ApiModelProperty(value="问题所属题目")
	private Course course;
	
	@ApiModelProperty(value="问题选项")
	private List<Option> options;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public Long getQuestiontypeid() {
		return questiontypeid;
	}
	public void setQuestiontypeid(Long questiontypeid) {
		this.questiontypeid = questiontypeid;
	}
	public String getQuestiontypelabel() {
		return questiontypelabel;
	}
	public void setQuestiontypelabel(String questiontypelabel) {
		this.questiontypelabel = questiontypelabel;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
}

