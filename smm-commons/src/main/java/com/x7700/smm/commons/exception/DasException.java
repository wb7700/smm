/**
 * 
 */
package com.x7700.smm.commons.exception;

import org.springframework.dao.DataAccessException;

/**
 * @author wangbing
 *
 */
public class DasException extends DataAccessException {

    /**
     * 9131210485605907278L
     */
    private static final long serialVersionUID = 9131210485605907278L;

    /**
     * @param msg
     */
    public DasException(String msg) {
        super(msg);
    }

    public DasException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
