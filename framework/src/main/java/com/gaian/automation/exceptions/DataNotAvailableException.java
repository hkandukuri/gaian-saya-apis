/**
 * 
 */
package com.gaian.automation.exceptions;

/**
 * @author hkandukuri
 *
 */

public class DataNotAvailableException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8684235482159475036L;

	public DataNotAvailableException(String message, Throwable e) {
		super(message, e);
	}

	public DataNotAvailableException(String message) {
		super(message);
	}
}
