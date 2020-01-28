package com.github.java.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		prime.isPrimeNumber(17);
	}
	
	public void isPrimeNumber(int number) {
		boolean isNotPrime= true;
		for(int a=2; a<number;a++) {
			if(number % a == 0) {
				isNotPrime = false;
				break;
			}
		}
		if(isNotPrime)
			System.out.println(number + " is Prime number");
		else
			System.out.println(number + " is Not a prime number");
	}
	
}
