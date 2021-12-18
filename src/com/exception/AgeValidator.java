package com.exception;

public class AgeValidator {

	void checkAge(int age) throws InvalidAgeException {
		
		if(age<18) {
			
			throw new InvalidAgeException("AGe is not valid...");
		}
		
		
	}

	public static void main(String[] args)  {

		AgeValidator a = new AgeValidator();
		try {
		a.checkAge(15);
		}catch (InvalidAgeException e) {
			
			System.err.println("INVALID AGE");
		}
		
	}
}
