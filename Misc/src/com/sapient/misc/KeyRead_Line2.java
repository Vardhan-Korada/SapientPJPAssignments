package com.sapient.misc;

import java.util.Scanner;

public class KeyRead_Line2 {
	private int[] list;
	private int sizeOfList;
	protected void read() {
		System.out.println("Enter the number of no.s you want to enter: ");
		Scanner sc = new Scanner(System.in);
		this.sizeOfList = sc.nextInt();
		list = new int[this.sizeOfList];
		for ( int i= 0; i< this.sizeOfList; i++) {
			System.out.println("Enter the number: ");
			this.list[i] = sc.nextInt();
		}
		sc.close();
	}
	protected void display() {
		for ( int i = 0; i< this.sizeOfList; i++) {
			System.out.print(this.list[i]+" ");
		}
		System.out.println();
	}
	protected void sort() {
		 int n = this.sizeOfList;
	     for (int i = 0; i < n-1; i++) {
	         for (int j = 0; j < n-i-1; j++) {
	             if (this.list[j] > this.list[j+1])
	                {
	                    int temp = this.list[j];
	                    this.list[j] = this.list[j+1];
	                    this.list[j+1] = temp;
	                }
	         }
	     }
		     this.display();     
	}
	protected void search(int key) {
		boolean found = false;
		for ( int i = 0; i<this.sizeOfList; i++) {
			if ( this.list[i] == key) {
				System.out.println("Element found at: "+(i+1));
				found = true;
			}
		}
		if ( found == false) {
			System.out.println("Element Not Found ...");
		}
	}
}
