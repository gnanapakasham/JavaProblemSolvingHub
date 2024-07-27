package com.string.problems;

import java.util.ArrayList;
import java.util.List;

public class MaximumWordFormByCharRotation {

	public static void main(String[] args) {

		String input = "ABC";
		// char[] charArray = input.toCharArray();
		List<String> wordList = new ArrayList<String>();

		for (int i = 0; i < input.length(); i++) {

			String firstCharacter = input.substring(0, 1);
			System.out.println("First char : " + firstCharacter);

			for (int j = 0; j < input.length(); j++) {
				String remString = input.substring(1, input.length());
				System.out.println("Remaining String : " + remString);

				char[] charArray = remString.toCharArray();

				for (int k = 0; k < remString.length() - 1; k++) {

					String output = firstCharacter + charArray[k] + charArray[k + 1];
					System.out.println("Output Value : " + output);
					wordList.add(output);

					for (int n = charArray.length - 1; n >= 0; n--) {
						char temp = charArray[k];
						charArray[k] = charArray[k + 1];
						charArray[k + 1] = temp;
					}

				}

			}

		}
	}

}
