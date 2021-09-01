package com.abstractionbackup;

abstract class Car{
	
	//abst body ....
	//
	//non abstrat  --> abstract
	abstract public void carColor();
	abstract public void carEngine();
	
	public void carpr() {
		
		System.out.println("");
	}
	
	
	//we can 
	//we can not create an object of abstracr class
	//immidiate..
	///x --> father -> y -->   z
	public Car() {
			
	}
		
}

class EndUser extends Car{

	public void cartype() {
		
		System.out.println("car type method...");
	}
	
	public void carColor() {
		
		System.out.println("my car color is RED");
//		EndUser e = new EndUser();
//		e.carpr();
		
		//reference 
		//method car class --> memory enduser 
		//run time polymorephisam
		//refernce  --> object
		//property parent class
		//Car c = new Car();
		//abstract  ---class level ->memory
		Car c = new EndUser(); /// car class  =-> end user
		c.carColor();
		
	}

	@Override
	public void carEngine() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
}
class Mic extends EndUser{

	@Override
	public void carColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carEngine() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

public class CarTest {

	
	public static void main(String[] args) {
		
		
		
	}
	
}
