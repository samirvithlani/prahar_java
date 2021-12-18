package com;

import java.util.Scanner;

class Employee {

}

public class ArrayDemo1 {

	public static void main(String[] args) {

		String s[] = new String[5];

		Employee e[] = new Employee[3];

		int a[] = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 1300;
		a[3] = 1040;
		a[4] = 1005;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {

			System.out.println("enter value of " + (i + 1));
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

	}
}
