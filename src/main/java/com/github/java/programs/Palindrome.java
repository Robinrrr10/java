package com.github.java.programs;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		pal.checkWhetherNumberIsPalindrome(101);
	}
	
	public void checkWhetherNumberIsPalindrome(int num) {
		System.out.println("number is:"+num);
		int a = num;
		int sum = 0;
		while(a > 0) {
			int remainder = a % 10;
			sum = (sum * 10) + remainder;
			a = a / 10;
		}
		if(num == sum)
			System.out.println(num + " Is Palindrome");
		else
			System.out.println(num + " Is Not Palindrome");
	}
	
}
