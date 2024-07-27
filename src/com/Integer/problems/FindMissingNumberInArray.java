package com.Integer.problems;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

		int[] array = { 1, 4, 5, 3, 7, 8, 6 };

		int n = 8;

		List<Integer> input = new ArrayList<Integer>();

		for (int a : array) {
			input.add(a);
		}

		for (int i = 1; i < n - 1; i++) {

			if (input.contains(i)) {
				continue;
			} else {
				System.out.println(i + " is missing");
			}

		}
	}
}
