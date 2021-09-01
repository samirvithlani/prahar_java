package com.overriding;

class Parent {

	// private method can not be override....
	public void pocketMoney() {

		System.out.println("parent pm called...");
	}
}

class Child extends Parent {

	public void pocketMoney() {

		System.out.println("child pm called,,,,");
	}

}

public class testOverriding {

	public static void main(String[] args) {

		Child c = new Child();
		c.pocketMoney();
	}
}
