package br.com.rh.exception;

import java.io.Serial;

public class ValidationException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 1L;

	public ValidationException(String message) {
		super(message);
	}

}
