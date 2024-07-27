package com.string.problems;

import java.util.Arrays;

public class MaximumFormationWords {

	public static void main(String[] args) {

		String inp = "ABC";

		char[] charArr = inp.toCharArray();
		System.out.println("Char Array Lenth : " + charArr.length);

		char firstChar = charArr[0];
		System.out.println("First Char : " + firstChar);

		char temp;

		StringBuffer sample = new StringBuffer();

		for (int k = 0; k < charArr.length - 1; k++) {
			
			temp = charArr[k];
			charArr[k] = charArr[k + 1];
			charArr[k + 1] = temp;

			for (int i = 1; i < charArr.length - 1; i++) {

				temp = charArr[i];
				charArr[i] = charArr[i + 1];
				charArr[i + 1] = temp;

				for (int j = 0; j < charArr.length; j++) {
					sample = sample.append(charArr[j]);
				}

				System.out.println(sample.toString());

			}
		}

		/*
		 * for (int i = 1; i <charArr.length-1; i++) {
		 * 
		 * temp = charArr[i]; charArr[i] = charArr[i + 1]; charArr[i + 1] = temp;
		 * 
		 * for (int j = 0; j < charArr.length; j++) { sample =
		 * sample.append(charArr[j]); }
		 * 
		 * System.out.println(sample.toString());
		 * 
		 * }
		 */
	}
}
