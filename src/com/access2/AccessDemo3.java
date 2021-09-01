package com.access2;

import com.access.AccessDemo;

class NotChild {
	
	
	void demo() {
		AccessDemo ac = new AccessDemo();
		System.out.println(ac.a);
		
	}
}
public class AccessDemo3 extends AccessDemo{

	
	
	void disp() {
		
		System.out.println(a);
	}
}
