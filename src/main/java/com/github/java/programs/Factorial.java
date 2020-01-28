package com.github.java.programs;

public class Factorial {

	public static void main(String[] args) {
		Factorial fac = new Factorial();
		fac.factorialOfNumber(6);
	}
	
	public void factorialOfNumber(int number) {
		int sum = 1;
		for(int i=number; i>=1; i--) {
			sum = sum * i;
		}
		System.out.println("factorial of "+ number + " is:"+ sum);
	}
	
}
