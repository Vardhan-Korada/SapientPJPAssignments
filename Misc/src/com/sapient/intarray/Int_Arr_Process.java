package com.sapient.intarray;

import java.util.Scanner;

public class Int_Arr_Process {
	private int[] arr;
	private int size;
	
	
	public Int_Arr_Process(int size) {
		this.arr = new int[size];
		this.size = size;
	}
	
	
	public Int_Arr_Process() {
		this.arr = new int[10];
		this.size = 10;
	}
	
	
	public Int_Arr_Process(int[] arr) {
		this.arr = new int[arr.length];
		for ( int i = 0; i< arr.length; i++) {
			this.arr[i] = arr[i];
		}
		this.size = arr.length;
	}
	
	
	public Int_Arr_Process(Int_Arr_Process ob) {
		this.arr = ob.arr.clone();
		this.size = ob.size;
	}
	
	
	public void readArray() {
		System.out.println("Reading Elements...");
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i< this.size; i++) {
			System.out.printf("Enter %dth element: ",i+1);
			this.arr[i] = sc.nextInt();
		}
		System.out.println("Read Complete...");
		sc.close();
	}
	
	
	public void printArray() {
		System.out.println("Printing Horizontally");
		for ( int i =0; i<this.size; i++) {
			System.out.print(this.arr[i]+" ");
		}
		System.out.println("\nPrinting Vertically");
		for ( int i =0; i<this.size; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	
	public void sortArray() {
		int z = 0;
		for ( int i= 0; i<this.size; i++) {
			for ( int j = 1; j<this.size-i; j++) {
				if (this.arr[j] < this.arr[j-1]) {
					z = this.arr[j];
					this.arr[j] = this.arr[j-1];
					this.arr[j-1] = z;
				}
			}
		}
		System.out.print("Sorted Array: ");
		for ( int i =0; i<this.size; i++) {
			System.out.print(this.arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public void printMinMax() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for ( int i = 0; i< this.size; i++) {
			if ( this.arr[i] > max) {
				max = this.arr[i];
			}
			if (this.arr[i] < min) {
				min = this.arr[i];
			}
		}
		System.out.println("Maximum: "+max);
		System.out.println("Minimun: "+min);
	}
	
	
	public void getSum() {
		int sum = 0;
		for ( int i =0; i<this.size; i++) {
			sum += this.arr[i];
		}
		System.out.println("Total: "+sum);
	}
	
	
	public void getSecondBiggest() {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for ( int i = 0; i< this.size; i++) {
			if ( this.arr[i] > max) {
				max = this.arr[i];
			}
		}
		for ( int i = 0; i< this.size; i++) {
			if ( this.arr[i] < min) {
				min = this.arr[i];
			}
		}
		int secondMax = min;
		for ( int i=0; i<this.size; i++) {
			if (this.arr[i] > secondMax && this.arr[i] < max) {
				secondMax = this.arr[i];
			}
		}
		System.out.println("Second Max: "+secondMax);
	}


	public int getLength() {
		// TODO Auto-generated method stub
		return this.size;
	}
}
