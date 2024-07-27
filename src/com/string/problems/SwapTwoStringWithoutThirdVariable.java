package com.string.problems;

public class SwapTwoStringWithoutThirdVariable {

	public static void main(String[] args) {
		
		String S1 = "JAVA";
		String S2 = "Python";
		
		S1 = S1+S2;
		System.out.println(S1);
		
		System.out.println("S1 length : " + S1.length());
		System.out.println("S2 length : " + S2.length());
		
		S2 = S1.substring(0, S1.length()-S2.length());
		S1 = S1.substring(S2.length());
		
		System.out.println(S1);
		System.out.println(S2);
		
		
		
		//System.out.println(S2.substring(0,-2));
		
		
	}
}
