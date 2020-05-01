package com.sapient.arithmetic;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 1 for Add, 2 for Sub, 3 for Mul, 4 for Div: ");
		int op  = sc.nextInt();
		Num_Process[] num_process = new Num_Process[4];
		num_process[0] = (a,b ) -> a+b;
		num_process[1] = (a,b) -> a-b;
		num_process[2] = (a,b ) -> a*b;
		num_process[3] = (a,b ) -> a/b;
		System.out.println(num_process[op-1].cal(num1, num2));
		sc.close();
	}

}
