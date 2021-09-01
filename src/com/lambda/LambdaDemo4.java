package com.lambda;

//functional interface...

@FunctionalInterface
interface Messaging2 {

	String msg(int count);

}

//depende

public class LambdaDemo4 {

	public static void main(String[] args) {

		Messaging2 m = (x) -> {

			System.out.println("messaging to PM");

				return "samir";
		};
		m.msg(100);

	}
}
