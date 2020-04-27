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
		Num_Process add = (int a,int b ) -> a+b;
		Num_Process sub = (int a,int b ) -> a-b;
		Num_Process mul = (int a,int b ) -> a*b;
		Num_Process div = (int a,int b ) -> a/b;
		switch(op) {
		case 1:{
			System.out.println("Result: "+add.cal(num1,num2));
			break;
		}
		case 2:{System.out.println("Result: "+sub.cal(num1,num2));
			break;
		}
		case 3:{
			System.out.println("Result: "+mul.cal(num1,num2));
			break;
		}
		case 4:{
			System.out.println("Result: "+div.cal(num1,num2));
			break;
		}
		default:{
			System.out.println("Invalid Choice...");
		}
		}
		sc.close();
	}

}
