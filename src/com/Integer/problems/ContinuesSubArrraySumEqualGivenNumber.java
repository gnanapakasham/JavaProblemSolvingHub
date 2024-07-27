package com.Integer.problems;

import java.util.ArrayList;

public class ContinuesSubArrraySumEqualGivenNumber {

	public static void main(String[] args) {

		int[] input = { 42, 15, 12, 8, 6, 32 };
		int givenNumber = 26;
		int temp = 0;
		boolean success = false;

		ArrayList<Integer> subarray = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {

			subarray.clear();
			temp = temp + input[i];
			subarray.add(input[i]);
			for (int j = i + 1; j < input.length; j++) {

				temp = temp + input[j];

				System.out.println("Temp Value : " + temp);

				if (temp > givenNumber) {
					temp = 0;
					break;
				} else if (temp == givenNumber) {
					System.out.println("Sub Array is equal");
					subarray.add(input[j]);
					success = true;
					break;
				} else {
					subarray.add(input[j]);
				}
			}

			if (success) {
				break;
			}
		}

		System.out.println("Sub Array : " + subarray.toString());
	}
}
