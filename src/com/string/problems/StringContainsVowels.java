package com.string.problems;

public class StringContainsVowels {

	public static void main(String[] args) {

		String input = "hellowdear";

		System.out.println(input.toLowerCase().matches(".*[aeiou].*"));
	}

}
