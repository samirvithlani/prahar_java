package com.lambda;

//functional interface...

@FunctionalInterface
interface Messaging {

	void msg();

}

//depende

public class LambdaDemo2 {

	public static void main(String[] args) {

		Messaging m = () -> {

			System.out.println("messaging to PM");
		};
		m.msg();

	}
}
