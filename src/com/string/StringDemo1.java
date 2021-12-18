package com.string;

//mutablity // imbulity...
//String im
public class StringDemo1 {

	public static void main(String[] args) {

		String s = "javva";
		// String s1 = new String("ptython");

		System.out.println(s);
		s.concat("c++");
		char c = s.charAt(1);
		System.out.println(c);

		System.out.println(s.charAt(0));
		int index = s.indexOf('v');
		System.out.println(index);
		System.out.println(s);

		int lindex = s.lastIndexOf('v');
		System.out.println(lindex);

		s = s.toUpperCase();
		System.out.println(s);

		s = s.toLowerCase();
		System.out.println(s);

		System.out.println(s.startsWith("jaa"));
		System.out.println(s.endsWith("a"));

		String address = "A,300,45,london street,15";
		String ss[] = address.split(",");

		System.out.println(address.split(","));

		for (int i = 0; i < ss.length; i++) {

			System.out.println(ss[i]);
		}

		// for each loop
		for (String x : ss) {

			System.out.println(x);
		}

	}
}
