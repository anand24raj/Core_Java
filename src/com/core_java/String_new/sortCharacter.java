package com.core_java.String_new;

public class sortCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "apple"; // aelpp
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
			}
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
