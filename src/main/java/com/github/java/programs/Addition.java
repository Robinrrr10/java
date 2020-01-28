package com.github.java.programs;

public class Addition {

	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println("Addition result is:" + addition.add(14, 16));
	}
	
	private int add(int a, int b) {
		return a + b;
	}
	
}
