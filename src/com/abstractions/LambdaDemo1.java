package com.abstractions;


interface Phone{
	
	void calling();
	
}

//dependcy create..
public class LambdaDemo1  implements Phone{

	@Override
	public void calling() {
		
		System.out.println("calling...");
		
	}
	
	public static void main(String[] args) {
	
		
		//reference of parent class and object of child class
		Phone p = new LambdaDemo1();
		p.calling();
	}

	
}
