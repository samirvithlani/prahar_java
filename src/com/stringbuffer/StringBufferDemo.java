package com.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("java");

		// sb.reverse();

		sb.append("abc");

		// sb.replace(0, 3, "#");
		System.out.println(sb);
		sb.insert(1, "X");

		sb.deleteCharAt(1);

		sb.setCharAt(1, 'P');
		System.out.println(sb);

	}
}
