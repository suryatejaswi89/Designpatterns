package com.designpatterns;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		 String sentence = scan.nextLine();
		
		//String reverseSentence = "";
		reverseSentence(sentence);

	}
	public static String reverseSentence(String sentence){
		String reverseString="";
		String[] words = sentence.split(" ");
		for(int i = 0; i<words.length; i++){
			String word = words[i];
			String reverseWord = "";
			for(int j=word.length()-1; j>=0 ; j--){
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord;
		}
		System.out.println(reverseString);
		return reverseString;
	}

}
