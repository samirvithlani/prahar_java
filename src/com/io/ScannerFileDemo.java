package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileDemo {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("C:\\Users\\Samir\\Desktop\\dictonry"));

			while ((sc.hasNext())) {

				System.out.println(sc.nextLine());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
