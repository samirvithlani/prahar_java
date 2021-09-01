package com.overloading;

public class Shape {

	public void area() {

		System.out.println("area method called...");
	}

	public void area(float r) {

		System.out.println(3.17 * (r * r) + " circle area...");
	}
	public void area(long w) {

		System.out.println("squ long area called...");
		
	}
	public void area(String name,String s) {
		
		System.out.println("name area called...");
	}

	public int area(int w) {

		System.out.println("squ int area called...");
		return w * w;
	}
	

	public void area(int h, int w) {

		System.out.println("rect area called....");
	}

	public static void main(String[] args) {
		
		
		Shape s = new Shape();
		s.area(100l);
		s.area(12.2f);
		s.area(10, 20);
		

	}
}
