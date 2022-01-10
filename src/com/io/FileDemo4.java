package com.io;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {

		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291\\bin");
		System.out.println(file.getName());
		System.out.println(file.getParent());

		String list[] = file.list();

		File f[] = file.listFiles();
		
		

		for (File ff : f) {

			System.out.println(ff);
		}

//		for(int i=0;i<list.length;i++) {
//			
//			System.out.println(list[i]);
//		}

		// for(String)
//		for (String s : list) {
//
//			System.out.println(s);
//		}
	}
}
