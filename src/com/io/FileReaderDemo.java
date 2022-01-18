package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("C:\\Users\\Samir\\Desktop\\dictonry");
			int c = reader.read();
			System.out.println((char) c);

			//read int... single single char...
			while ((c = reader.read()) != -1) {
				
				System.out.print((char)c);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
