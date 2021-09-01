package com.abstractions;

interface Gov {

	 //
	//final static int x=10;
	int x =10;
	void tax();
}

interface TRAI {

	// public abstract void call();
	void call();
}

class JIO implements TRAI, Gov {

	public void call() {
		
		System.out.println("jio called...");

	}

	public void tax() {
		// TODO Auto-generated method stub

	}

}

class Airtle implements TRAI {

	@Override
	public void call() {

		System.out.println("airtle called");
	}

}

public class Telicom {
	
	
	
	public static void main(String[] args) {
		
		
		TRAI t =new JIO();
		t.call();
	}

}
