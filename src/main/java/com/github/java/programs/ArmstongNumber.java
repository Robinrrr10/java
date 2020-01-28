package com.github.java.programs;

public class ArmstongNumber {

	public static void main(String[] args) {
		ArmstongNumber arm = new ArmstongNumber();
		arm.isArmstongNumber(153);
	}
	
	public void isArmstongNumber(int num) {
		int a = num;
		int sum = 0;
		int remainder;
		while(a > 0) {
			remainder = a % 10;
			a = a / 10;
			sum = sum + (remainder * remainder * remainder);
		}
		System.out.println("after cube:" + sum);
		if( sum == num )
			System.out.println(num + " is armstrong number");
		else
			System.out.println(num + " is Not armstrong number");
	}
	                    												
}
