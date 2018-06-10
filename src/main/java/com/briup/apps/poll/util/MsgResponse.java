/**
 * Project Name:homework
 * File Name:MsgResponse.java
 * Package Name:com.briup.apps.homework.util
 * Date:2018年5月8日上午11:40:59
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.util;


/**
 * ClassName:MsgResponse <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月8日 上午11:40:59 <br/>
 * 
 * @author lichunyu
 * @version
 * @since JDK 1.6
 * @see
 */
public class MsgResponse {
	private Integer status;
	private String message;
	private Object data;
	
	public static MsgResponse success(String message, Object data) {
		MsgResponse msg = new MsgResponse();
		msg.setStatus(200);
		msg.setMessage("success");
		msg.setData(data);
		return msg;
	}
	
	public static MsgResponse fail(String message,Object data) {
		MsgResponse msg = new MsgResponse();
		msg.setStatus(500);
		msg.setMessage(message);
		msg.setData(data);
		return msg;
	}
	
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}