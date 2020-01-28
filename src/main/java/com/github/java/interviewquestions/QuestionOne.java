package com.github.java.interviewquestions;

public class QuestionOne {
	
	// a = "abcde"
	// b = "12345678"
	// output c = "a1b2c3d4e5678"
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abcd", b="12345678";
		String result = getOutput(a, b);
		System.out.println("result:"+result);
	}
	
	public static String getOutput(String a, String b) {
		StringBuffer c = new StringBuffer();;
		int sizeOfA = a.toCharArray().length;
		int sizeOfB = b.toCharArray().length;
		int maxSize = sizeOfA > sizeOfB? sizeOfA: sizeOfB;
		
		for(int i=0;i<maxSize;i++) {
			if(i<sizeOfA)
				c.append(a.charAt(i));
			if(i<sizeOfB)
				c.append(b.charAt(i));
		}
		
		return c.toString();
	}
}
