package com.github.java.interviewquestions;

public class QuestionTwo {
	
	// Print first non repeated character
	// a = "madam "
	// output = d

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "madamol";
		Character result = null;
		mainLoop:
		for(int i=0; i<a.toCharArray().length; i++) {
			innerLoop:
			for(int j=i+1; j<a.toCharArray().length; j++) {
				if(a.charAt(i)==a.charAt(j)) {
					break innerLoop;
				}else if(j == a.toCharArray().length -1) {
					result = a.charAt(i);
					break mainLoop;
				}
				
			}
		}
		if(result != null) {
			System.out.println("Result:"+result);
		}else {
			System.out.println("All char are repeated");
		}
	}
}
