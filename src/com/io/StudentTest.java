package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	int sId;
	String sName;

	public Student(int sId, String sName) {

		this.sId = sId;
		this.sName = sName;
	}

}

public class StudentTest {

	public static void main(String[] args) {

		Student s = new Student(101, "jay");
		// serilization

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
			out.writeObject(s);
			out.close();
			System.out.println("data serilize...");

			// platform independent...
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
			Student s1 = (Student) in.readObject();
			System.out.println(s1.sId);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
