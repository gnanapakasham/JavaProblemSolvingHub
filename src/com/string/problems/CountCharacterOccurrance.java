package com.string.problems;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrance {

	public static void main(String[] args) {

		String S1 = "Java J2EE Java JSP J2EE";
		char[] inputArray = S1.toCharArray();

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (char c : inputArray) {

			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
