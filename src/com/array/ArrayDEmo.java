package com.array;

public class ArrayDEmo {

	public static void main(String[] args) {

		// new keyword *
		int a[] = new int[10]; // 0 to 9
		/*
		 * a[0] = 10; a[1] = 100; a[2] = 1000; a[3] = 20; a[4] = 30; a[5] = 450; a[7] =
		 * 78; a[8] = 98; a[9] = 55;
		 */
		
		
		for (int i = 0; i < a.length; i++) {

			//0 =  0 + 10
			//1 =  0 + 10 = 10
			a[i] = i+ 10;
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		int index0 = a[0];
		System.out.println(index0);
		System.out.println(a[0]);

	}
}
