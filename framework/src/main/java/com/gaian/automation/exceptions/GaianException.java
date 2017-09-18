package com.gaian.automation.exceptions;

public class GaianException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GaianException(){
        super();
    }

    public GaianException(Throwable t){
        super(t);
    }

    public GaianException(String message){
        super(message);
    }

    public GaianException(String message, Throwable t){
        super(message, t);
    }
}
