package com.string.problems;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String S1 = "Dormitory";
		String S2 = "Dirty Room";

		S1 = S1.replaceAll(" ", "");
		S2 = S2.replaceAll(" ", "");

		char[] arr1 = S1.toLowerCase().toCharArray();
		char[] arr2 = S2.toLowerCase().toCharArray();

		if (arr1.length == arr2.length) {

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			if (Arrays.equals(arr1, arr2)) {
				System.out.println("Given String is an Anagram");
			} else {
				System.out.println("Given String not an Anagram");
			}
		} else {
			System.out.println("Given String not an Anagram");
		}
	}

}
