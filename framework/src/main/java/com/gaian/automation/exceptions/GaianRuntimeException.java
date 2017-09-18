package com.gaian.automation.exceptions;

public class GaianRuntimeException extends RuntimeException {
	private static final long serialVersionUID = -7265893519091822730L;

	public GaianRuntimeException() {
		super();
	}

	public GaianRuntimeException(Throwable t) {
		super(t);
	}

	public GaianRuntimeException(String message) {
		super(message);
	}

	public GaianRuntimeException(String message, Throwable t) {
		super(message, t);
	}
}
