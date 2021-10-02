package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("pls enter no");
			int no = sc.nextInt();

			int ans = 10 / no;
			System.out.println("ans = >" + ans);

		}

//		catch (Exception e) {
//
//			System.out.println("error in programme");
//		}
//dead blocks
		
		
		catch (ArithmeticException e) {

			System.out.println("Cannot divide by zero");
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (InputMismatchException e) {

			System.out.println("pls check your input....");
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}
}
