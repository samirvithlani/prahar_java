package com.io;

import java.io.File;

public class FileDemo5 {

	public static void main(String[] args) {

		//relative path...
		File file = new File("abc");
		System.out.println(file.isDirectory());

		System.out.println(file.getAbsolutePath());

	}
}
