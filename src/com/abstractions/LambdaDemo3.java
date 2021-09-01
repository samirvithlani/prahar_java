package com.abstractions;

/*
 * @ is an annotation...
 * */
@FunctionalInterface
interface Amazone {

	int order();

}

public class LambdaDemo3 {

	public static void main(String[] args) {

		Amazone a = () -> {

			System.out.println("amazone called...");

			return 100;
		};

		System.out.println(a.order());
	}
}
