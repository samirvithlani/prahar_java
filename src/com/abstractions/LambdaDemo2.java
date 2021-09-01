package com.abstractions;

interface Uni{
	
	
	void students();
}
public class LambdaDemo2 {

	
	 public static void main(String[] args) {
		
		 Uni u = ()->{
			 
			 //student method body...
			 System.out.println("student called...");
		 };
		 
		 u.students();
	}
}
