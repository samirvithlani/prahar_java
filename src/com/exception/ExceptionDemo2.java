package com.exception;

public class ExceptionDemo2 {

	public void demo() {

		System.out.println("demo method called...");
	}

	public static void main(String[] args) {

		try {
			ExceptionDemo2 e2 = new ExceptionDemo2();
			// e2=null;
			System.out.println("A");
			e2.demo();
			System.out.println("B");
			// 1cr
			// 10 file -> 8 exceptiopn
			// open

			// close

		} catch (NullPointerException e) {

			System.out.println("pl check object...");
		}

		finally {

			// cleanup proecess
			// transaction management....
			System.out.println("finally blocked....");
		}

	}
}
