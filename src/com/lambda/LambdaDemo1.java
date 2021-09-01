package com.lambda;

//without lambda

interface Calling{
	
	void call();
}


public class LambdaDemo1 implements Calling{

	@Override
	public void call() {
		
		System.out.println("calling to PM");
		
	}
	
	
	public static void main(String[] args) {
		
		
		//parent class reference and child class memory
		
		Calling c = new LambdaDemo1();
		c.call();
		
	}

}
