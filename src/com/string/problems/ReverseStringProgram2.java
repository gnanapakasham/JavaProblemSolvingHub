package com.string.problems;

import java.util.Arrays;
import java.util.List;

public class ReverseStringProgram2 {

	/**
	 * Input : "Today is Friday" output : "yadir Fs iyadoT"
	 */

	public static void main(String[] args) {

		String input = "Today is Friday";
		char[] inputArray = input.replaceAll(" ", "").toCharArray();
		char[] outputArray = new char[inputArray.length];

		for (int i = inputArray.length - 1; i >= 0; i--) {

			for (int j = 0; j < outputArray.length; j++) {

				outputArray[j] = inputArray[i];

			}

		}

		String string = new String(outputArray);
		System.out.println(string);
	}

}
