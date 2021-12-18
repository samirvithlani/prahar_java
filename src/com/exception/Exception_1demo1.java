package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_1demo1 {

	public static void main(String[] args) {
		
		
		int x = 10 / 0;

		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("enter b ");
			int b = sc.nextInt();
			int a = 10;

			int c = a / b;

			System.out.println(c);
		}

		catch (ArithmeticException e) {

			System.out.println("Cannot divide by zero");
		} catch (InputMismatchException e) {

			System.out.println("pls check  your input");
		} catch (Exception e) {

			System.err.println("ERROR...");
		}

	}
}
