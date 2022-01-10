package com.io;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Samir\\Desktop\\useinput.txt");

		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		
		//System.out.println(file.setReadOnly());
		

	}
}
