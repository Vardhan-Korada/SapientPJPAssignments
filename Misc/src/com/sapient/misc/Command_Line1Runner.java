package com.sapient.misc;

public class Command_Line1Runner {
	public static void main(String[] args) {
		int[] arr;
		if (args.length > 1) {
			arr = new int[Integer.parseInt(args[0])];
			for ( int i = 0; i< Integer.parseInt(args[0]); i++) {
				arr[i] = Integer.parseInt(args[i+1]);
			}
			Command_Line1 cl = new Command_Line1();
			cl.setData(arr);
			cl.callData();
			cl.displayData();
		} else {
			System.out.println("Improper Command Line Arguments");
		}
	}
}
