package com.abstractions;

interface calc {

	int sum(int a, int b);
}

public class LamdaDemo4 {

	public static void main(String[] args) {

		calc c = (no1, no2) -> {

			//System.out.println(no1 + no2);
			return no1 + no2;
		};
		System.out.println(c.sum(100, 200));
	}
}
