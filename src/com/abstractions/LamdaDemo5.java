package com.abstractions;

interface Convert{
	
	
	String to(String str);
}
public class LamdaDemo5 {

	
	public static void main(String[] args) {
		
		
		Convert c = (name)->{
		
			return name.toUpperCase();
		};
		
		System.out.println(c.to("java"));
		
		
		
	}
	
}
