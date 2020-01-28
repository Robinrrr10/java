package com.github.java.programs;

public class Fibonacci {

	public static void main(String[] args) {
		int fibLength = 10;
		Fibonacci fibonnaci = new Fibonacci();
		fibonnaci.fibo(fibLength);
	}
	
	public void fibo(int lenght) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=lenght; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
