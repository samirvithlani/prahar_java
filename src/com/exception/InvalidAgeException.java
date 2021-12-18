package com.exception;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String param) {

		//AGE IS NOT VALID
		super(param);
	}

}
