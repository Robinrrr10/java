package com.github.java.interviewquestions;

public class QuestionFive {

	public static void main(String[] args) {
		String a = "This";
		String b = "pant";
		System.out.println("Before======> a:"+a+" b:"+b);
		a = a.concat(b);
		b = a.substring(0, a.indexOf(b));
		a = a.substring(b.length());
		System.out.println("After=======> a:"+a+" b:"+b);
	}
	
}
