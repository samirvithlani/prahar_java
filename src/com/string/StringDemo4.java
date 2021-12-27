package com.string;

public class StringDemo4 {

	public static void main(String[] args) {

		String para = "ola cars naman is not good ola a";

		String paraarray[] = para.split(" ");
		int count = 0;

		for (int i = 0; i < paraarray.length; i++) {

			StringBuffer sb = new StringBuffer(paraarray[i]);

			StringBuffer word = sb.reverse();
			String s = new String(word);
			System.out.println(paraarray[i]);
			System.out.println(s);

			if (paraarray[i].equals(s)) {
				count++;
				System.out.println("matched..");
			}

		}
		System.out.println(count);
	}

}
