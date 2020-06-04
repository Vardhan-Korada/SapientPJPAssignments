package com.sapient.testing.numbers;

public class Number {

	public static boolean checkPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	public static boolean checkArmstrong(int num) {
		int tot = 0;
		int l = Integer.toString(num).length();
		char[] arr = Integer.toString(num).toCharArray();
		for (char i : arr) {
			tot += Math.pow(Integer.parseInt(String.valueOf(i)),l);
		}
		return tot == num;
	}

	public static boolean checkPalindrome(int num) {
		int on = num,rev=0,rem=0;
		for(;num!=0;num/=10) {
			rem = num%10;
			rev = rev*10+rem;
		}
		return rev == on;
	}
}
