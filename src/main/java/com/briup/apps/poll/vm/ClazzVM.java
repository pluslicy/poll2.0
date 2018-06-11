/**
 * Project Name:poll
 * File Name:ClazzVM.java
 * Package Name:com.briup.apps.poll.vm
 * Date:2018年6月11日下午12:02:57
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.vm;
/**
 * ClassName:ClazzVM <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月11日 下午12:02:57 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.bean.User;

//班级模型
public class ClazzVM {
	private Long id;
	private String name;
	private String description;
	private Grade grade;
	private User charge;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public User getCharge() {
		return charge;
	}
	public void setCharge(User charge) {
		this.charge = charge;
	}
}

