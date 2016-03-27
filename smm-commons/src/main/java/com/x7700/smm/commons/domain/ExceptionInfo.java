/**
 * 
 */
package com.x7700.smm.commons.domain;

import java.io.Serializable;

/**
 * @author wangbing
 *
 */
public class ExceptionInfo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6425784703610412329L;

	private Integer errorCode;

	private String errorMsg;

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {

		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {

		this.errorMsg = errorMsg;
	}

}
