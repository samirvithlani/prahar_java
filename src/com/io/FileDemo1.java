package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo1 {

	public static void main(String[] args) {

		File f = null;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Enter your choice");
			System.out.println("Press 1 for create new file.....");
			System.out.println("Press 2 fro Delete File");
			System.out.println("Press 3 for check exist or not");
			System.out.println("Press for create folder");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("pls enter file name to create...");

				String fileName = sc.next();
				File file = new File(fileName.concat(".txt"));
				try {

					if (file.createNewFile()) {

						System.out.println(fileName + " Is Created...");
					} else {

						System.out.println("file is not created...");
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 2:

				System.out.println("pls enter file name to create...");
				String fileNametoDelete = sc.next();
				File file1 = new File(fileNametoDelete);
				if (file1.delete()) {

					System.out.println("File Deeletd...");
				} else {

					System.out.println("file not deleted..");
				}

				break;
			case 3:

				File file2 = new File("log1.txt");
				System.out.println(file2.exists());
				break;

			case 4:
				f = new File("java");
				System.out.println(f.mkdir());
				break;

			
			default:
				break;
			}

		} while (choice != 5);

	}
}
