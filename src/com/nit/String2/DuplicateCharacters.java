package com.nit.String2;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String s = "anand";
		// ad
		// apple -> apple
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {

			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;

					ch[j] = '*';
				}
			}
			// 2>1
			if (count > 1 && ch[i] != '*') {
				IO.println(s.charAt(i));
			}
		}

	}
}
