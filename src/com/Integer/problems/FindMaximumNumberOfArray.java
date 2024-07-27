package com.Integer.problems;

public class FindMaximumNumberOfArray {

	public static void main(String[] args) {

		int[] intArray = { 115, 2, 15, 8, 9, 4, 0 };

		int maxNumber = 0;
		int temp;
		
		for (int i = 0; i < intArray.length - 1; i++) {

			if (intArray[i] > intArray[i + 1]) {
				temp = intArray[i];
			} else {
				temp = intArray[i + 1];
			}

			if (temp > maxNumber) {
				maxNumber = temp;
			}
		}

		System.out.println("Maximum number of an Array : " + maxNumber);
	}
}
