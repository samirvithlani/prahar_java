package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDEmo1 {

	public static void main(String[] args) {

		// File file = new File("log1.txt");
		try {
			String s = "log1.txt";
			FileWriter writer = new FileWriter(s,true);
			writer.write("Hello Prahar !!");
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
