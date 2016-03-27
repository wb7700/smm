package com.x7700.smm.commons.constant;

/**
 * 使用Integer完全是为了兼容公司现有系统，注意最大不要超过2147483647 错误码常量类 采用AABBCCCDDD，正确的使用应该是String
 * AA-事业部，比如散客票，火车票，用车。 BB-子系统，比如订单，确认，票务，适配。
 * CCC-模块，比如快递，保险，促销活动，商旅卡。999-公共异常(不允许业务使用) DDD-具体业务错误。 机票事业部-AA-10 订单系统-BB-10
 * 
 * @author wangbing
 */
public enum CommonExceptionCode {

	UNKNOWN_EXCEPTION(1010999999, "未知错误"),

	DATABASE_EXCEPTION(1010999998, "数据库错误"),

	REFLECTION_EXCEPTION(1010999997, "反射异常"),

	PARAM_INVALID_EXCEPTION(1010999996, "参数无效"),;

	private Integer errorCode;

	private String errorMsg;

	private CommonExceptionCode(Integer errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

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

	public static String getErrorMsg(Integer errorCode) {
		CommonExceptionCode[] codes = CommonExceptionCode.values();
		for (CommonExceptionCode code : codes) {
			if (code.getErrorCode().intValue() == errorCode.intValue()) {
				return code.getErrorMsg();
			}
		}
		return UNKNOWN_EXCEPTION.getErrorMsg();
	}
}
