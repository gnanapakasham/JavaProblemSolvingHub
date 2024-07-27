package com.string.problems;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Anthology is best";
		String[] strArr = str.split(" ");
		StringBuffer strBuff = new StringBuffer();

		// 1st Method
		for (int i = 0; i < strArr.length; i++) {

			StringBuffer inp = new StringBuffer(strArr[i]);
			inp = inp.reverse();
			// System.out.println(inp);
			strBuff.append(inp).append(" ");
		}

		System.out.println(strBuff.toString());
		StringBuffer inp = new StringBuffer(str);
		System.out.println(inp.reverse());

		// 2nd Method
		char[] strArray = str.toCharArray();
		for (int k = strArray.length - 1; k >= 0; k--) {
			System.out.println(strArray[k]);
		}

		// 3rd Method

		String reversString = "";

		for (int i = 0; i < strArr.length; i++) {

			String input = strArr[i];
			String reverseWord = "";

			for (int j = input.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + input.charAt(j);
			}
			reversString = reversString + reverseWord + " ";
		}

		System.out.println("Reverse Sentence : " + reversString);

	}
}
