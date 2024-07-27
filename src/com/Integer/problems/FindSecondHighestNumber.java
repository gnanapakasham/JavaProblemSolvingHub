package com.Integer.problems;

public class FindSecondHighestNumber {
	
	public static void main(String[] args) {
		
		int[] input = {2,5,3,8,0,45,2,23,78,56};
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int value : input) {
			
			if(value > highest) {
				highest = value;
				secondHighest = highest;
			}else {
				secondHighest = value;
			}
		}
		
		System.out.println("Second Highest Values is : " + secondHighest);
	}

}
