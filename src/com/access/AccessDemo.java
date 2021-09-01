package com.access;

public class AccessDemo {

	static int a;

	public static void main(String[] args) {

		System.out.println(a);
	}
}

class Child extends AccessDemo {

	void display() {
		System.out.println(a);
	}
}