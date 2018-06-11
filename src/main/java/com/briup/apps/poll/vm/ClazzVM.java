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

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.bean.User;

public class ClazzVM {
	private Clazz clazz;
	private Grade grade;	//所属年级
	private User user;
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}

