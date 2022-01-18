package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferDemo1 {

	public static void main(String[] args) {

		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\Samir\\Desktop\\dictonry");
			BufferedReader br = new BufferedReader(fr);
			String data = null;
			while ((data = br.readLine()) != null) {

				System.out.println(data);
			}
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
