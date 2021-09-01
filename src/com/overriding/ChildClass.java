package com.overriding;



class ParentClass{
	
	public ParentClass(int a) {
		
		System.out.println("parent class default const...");
	}
	
	
	
	
	
	int a=10;
	
	public void pm(int a) {
		
		System.out.println("parent class pm method called..");
	}
	public void demo() {
		System.out.println("demo");
	}
}


public class ChildClass extends ParentClass{

	
	public ChildClass() {
		super(15);
		System.out.println("child class");
	}
	
	
	int a=100;
	public void pm() {
	
		
		super.demo();
		System.out.println("child class pm method called..."+super.a);
		
	}
	
	public static void main(String[] args) {
		
		
		ChildClass c = new ChildClass();
		c.pm();
				
		
	}
	
}
