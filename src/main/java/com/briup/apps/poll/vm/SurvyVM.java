/**
 * Project Name:poll
 * File Name:SurvyVM.java
 * Package Name:com.briup.apps.poll.vm
 * Date:2018年6月14日下午4:12:35
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.vm;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.bean.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName:SurvyVM <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年6月14日 下午4:12:35 <br/>
 * 
 * @author lichunyu
 * @version
 * @since JDK 1.6
 * @see
 */
@ApiModel(value = "课调")
public class SurvyVM {
	@ApiModelProperty(value="课调编号")
	private Long id;
	@ApiModelProperty(value="课调日期")
	private String survydate;
	@ApiModelProperty(value="课调状态")
	private String state;
	@ApiModelProperty(value="课调码")
	private String code;
	@ApiModelProperty(value="年级")
	private Grade grade;
	@ApiModelProperty(value="班级")
	private Clazz clazz;
	@ApiModelProperty(value="课程")
	private Course course;
	@ApiModelProperty(value="老师")
	private User teacher;
	@ApiModelProperty(value="问卷")
	private QuestionnaireVM questionnaireVM;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSurvydate() {
		return survydate;
	}
	public void setSurvydate(String survydate) {
		this.survydate = survydate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public User getTeacher() {
		return teacher;
	}
	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}
	public QuestionnaireVM getQuestionnaireVM() {
		return questionnaireVM;
	}
	public void setQuestionnaireVM(QuestionnaireVM questionnaireVM) {
		this.questionnaireVM = questionnaireVM;
	}
}
