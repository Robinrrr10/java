package com.github.java.programs;

public class Division {
	public static void main(String[] args) {
		Division div = new Division();
		int result = div.divide(23686, 7);
		System.out.println("Result is: "+result);
		
		float result2 = div.divideIt(23686, 7);
		System.out.println("Result is: "+result2);
	}
	
	private int divide(int a, int b) {
		return a / b;
	}
	
	private float divideIt(int a, int b) {
		float aa = a;
		float bb = b;
		float result = aa / bb;
		return result;
	}
}


