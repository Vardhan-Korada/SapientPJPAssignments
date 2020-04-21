package com.sapient.misc;

public class Command_Line1 {
	private int[] arr;
	protected void setData(int[] list) {
		arr = new int[list.length];
		for ( int i = 0; i< list.length; i++) {
			this.arr[i] = list[i];
		}
	}
	protected void callData() {
		for ( int i= 0; i< arr.length; i++) {
			System.out.print(this.arr[i]+" ");
		}
		System.out.println();
	}
	protected void displayData() {
		int sum = 0;
		for ( int i=0 ; i< this.arr.length; i++) {
			sum += this.arr[i];
		}
		System.out.println("Sum is : "+sum);
		System.out.println("Average is : "+(double)sum/this.arr.length);
		int min = this.arr[0],max= this.arr[0];
		for ( int i=0 ; i< this.arr.length; i++) {
			if ( this.arr[i] > max) {
				max = this.arr[i];
			} else if (this.arr[i] < min) {
				min = this.arr[i];
			}
		}
		System.out.println("Max is : "+max);
		System.out.println("Min is : "+min);
	}
}
