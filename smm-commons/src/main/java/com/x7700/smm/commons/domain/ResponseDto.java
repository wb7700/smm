package com.x7700.smm.commons.domain;

import java.io.Serializable;

public class ResponseDto implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4153854180027231943L;

	// 成功标记
	private boolean success = true;
	// 提示信息
	private String msg;
	// 错误码
	private int errorCode;
	// 返回的具体数据
	private Object data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
