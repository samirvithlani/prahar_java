package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter file name::");
		String fname = sc.next();
		System.out.println("pls entet folder name:");
		String folderName = sc.next();

		File folder = new File(folderName);
		if (folder.exists()) {

			File file = new File(folderName + "/" + fname);
			try {
				if (file.createNewFile()) {

					System.out.println("file created....");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
