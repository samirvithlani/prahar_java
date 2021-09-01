package com.abstractionbackup;

interface Exam{
	
	//fully abstartct
	//public abstract
	void marks();
}

class Student implements Exam{

	@Override
	public void marks() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class Uni {
	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.marks();
		
		

		//parent class props and memory of child class
		//ref of parent class memory of child
		
		Exam a = new Student();
		a.marks();
		
	}

}
