/**
 * Project Name:poll
 * File Name:UserVM.java
 * Package Name:com.briup.apps.poll.vm
 * Date:2018年6月12日上午9:14:09
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.vm;
/**
 * ClassName:UserVM <br/>
 * Function: User模型类，该类中不仅包含了User的基本属性，还包含了User所在年级属性. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月12日 上午9:14:09 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import com.briup.apps.poll.bean.Grade;

public class UserVM {
	private Long id;

	private String name;

	private String gender;

	private String birth;

	private String hiredate;

	private Grade grade;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
}
