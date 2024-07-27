package com.string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatCharacters {

	public static void main(String[] args) {

		String input = "javaconceptoftheday";
		char[] charArray = input.toCharArray();
		ArrayList<Character> output = new ArrayList<Character>();
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		for (int i = 0; i < charArray.length; i++) {

			for (int j = i + 1; j < charArray.length; j++) {

				if (!output.contains(charArray[j])) {
					output.add(charArray[j]);
				} else {
					hmap.put(output.toString().replaceAll("\\[|\\]", "").replaceAll(", ", "\t"), output.size());
					output.clear();
				}
			}

		}

		Integer bestValue = 0;
		String sub = null;

		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {

			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

	}

}
