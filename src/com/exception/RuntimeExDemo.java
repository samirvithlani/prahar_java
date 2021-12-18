package com.exception;


class AgeCalc {

	public void calc() throws ClassNotFoundException {

		System.out.println("input.....");

	}

}

//pre built class's method 
//or user define's class method who is throwing any exceptoion so we have to handle that exceptoin
public class RuntimeExDemo {

	// JVM COMPILER...
	void udf() throws ClassNotFoundException {

		AgeCalc a = new AgeCalc();
		a.calc();

	}

	public static void main(String[] args) {

		AgeCalc a = new AgeCalc();
		try {
			a.calc();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			Class.forName("java.lang.String");
			System.out.println("ok");

		} catch (ClassNotFoundException e) {

			System.out.println("ERROR");
		}

	}
}
