package com.lambda.samples;

public class FindWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Android gave new average   life to apple Java";
		boolean isFound = input.indexOf("average") !=-1? true: false; 
		System.out.println(isFound);
	}

}
