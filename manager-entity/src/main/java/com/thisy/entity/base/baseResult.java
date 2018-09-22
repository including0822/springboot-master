package com.thisy.entity.base;

import java.io.Serializable;

public class baseResult<T> implements Serializable {
	/*服务状态*/
	private String state;
	/*服务信息*/
	private  String msg;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
