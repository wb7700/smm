/**
 * 
 */
package com.x7700.smm.commons.exception;

/**
 * @author wangbing
 *
 */
public class BeanCopyException extends BaseException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6863063675145470994L;

    public BeanCopyException() {
        super();
    }

    public BeanCopyException(Throwable cause) {
        super(cause);
    }

    public BeanCopyException(Integer errorCode) {
        super(errorCode);
    }

    public BeanCopyException(Integer errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public BeanCopyException(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public BeanCopyException(Integer errorCode, String errorMessage, Throwable cause) {
        super(errorCode, errorMessage, cause);
    }
}
