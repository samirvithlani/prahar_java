package com.array;

class Employee {

	int id;
	String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
//	public Employee(int id, String name) {
//
//		this.id = id;
//		this.name = name;
//	}

}

public class EmployeeClient {

	public static void main(String[] args) {

		int a[] = new int[3];
		a[0] = 100;

		Employee e[] = new Employee[3];

		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "jay";
		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "raj";
		Employee e3 = new Employee();
		e3.id = 103;
		e3.name = "part";

		// Employee e1 = new Employee(101, "jay");
		// Employee e2 = new Employee(102, "raj");
		// Employee e3 = new Employee(103, "parth");

		e[0] = e1;
		e[1] = e2;
		e[2] = e3;

		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].id + "--" + e[i].name);
		}

	}
}
