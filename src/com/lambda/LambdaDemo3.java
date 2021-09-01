package com.lambda;

//functional interface...

@FunctionalInterface
interface Messaging1 {

	void msg(int a,int b);

}

public class LambdaDemo3 {

	public static void main(String[] args) {

		Messaging1 m = (a,b) -> {

			System.out.println("messaging to PM"+a);
		};
		m.msg(1500,52);

	}
}
