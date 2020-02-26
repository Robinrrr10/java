package com.github.java.interviewquestions;

public class QuestionFour {

	// a = "Hi how are you"
	// result = "iH woh era uoy"
	// result 2 = "you are how Hi"
	
	public static void main(String[] args) {
	
		String a = "Hi how are you";
		String result = giveReverseChars(a);
		String result2 = giveReverseWord(a);
		System.out.println("Result 1:"+result);
		System.out.println("Result 2:"+result2);
	}
	
	// result = "iH woh era uoy"
	private static String giveReverseChars(String a) {
		StringBuffer str = new StringBuffer();
		String[] allWords = a.split(" ");
		for(String word : allWords) {
			String revWord = "";
			for(int i=word.toCharArray().length-1; i>=0; i--) {
				revWord = revWord.concat(String.valueOf(word.charAt(i)));
			}
			str.append(revWord + " ");
		}
		return str.toString();
	}
	
	//you are how Hi
	private static String giveReverseWord(String a) {
		StringBuffer str = new StringBuffer();
		String[] allWords = a.split(" ");
		for(int i = allWords.length-1; i>=0; i--) {
			str.append(allWords[i]);
			if(i>0)
				str.append(" ");
		}
		return str.toString();
	}
	
}
