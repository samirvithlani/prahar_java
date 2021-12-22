package com.string;

public class StringDemo2 {

	public static void main(String[] args) {

		String name = "name"; //  //97 + 10 107  107  107 - 75 = 32
		System.out.println(name.compareTo("JAVA")); //65 + 10 75 J = 75
		
		String name1 = "a";
		System.out.println(name1.compareTo("A"));
		
		
		
		char c[] = name.toCharArray();
		String str  = name.substring(1);
		
		System.out.println("str = "+str);
		
		
		String str1 = name.substring(0, 2);
		System.out.println("str1 "+str1);
		
		
		
		String password = "   samir   ";
		System.out.println(password);
		System.out.println("len -- "+password.length());
		
		password = password.trim();
		System.out.println(password);
		System.out.println("len -- "+password.length());
		
		//name = name.concat(password);
		System.out.println(name);
		
		
		System.out.println(name.contains("A"));
		
		String emp = " ";
		System.out.println(emp.isEmpty());
		
		
		
		
		
		
		
		
		
		
		

	}
}
