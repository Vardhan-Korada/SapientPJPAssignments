package com.sapient.matrix;

import java.util.Scanner;

public class Matrix {
	private int[][] arr;
	private int rows;
	private int columns;
	public Matrix(int m, int n) {
		this.arr = new int[m][n];
		this.rows = m;
		this.columns = n;
	}
	public Matrix() {
		this.arr = new int[3][3];
		this.rows = 3;
		this.columns = 3;
	}
	public Matrix(int[][] arr) {
		this.arr = new int[arr.length][arr[0].length];
		for ( int i = 0; i<arr.length; i++) {
			for ( int j=0; j<arr[0].length; j++) {
				this.arr[i][j] = arr[i][j];
			}
		}
		this.rows = arr.length;
		this.columns = arr[0].length;
	}
	public Matrix(Matrix mat) {
		this.arr = new int[mat.rows][mat.columns];
		for ( int i = 0; i<mat.rows; i++) {
			for ( int j=0; j<mat.columns; j++) {
				this.arr[i][j] = mat.arr[i][j];
			}
		}
	}
	public void readMatrix() {
		System.out.println("Begining the reading of the Matrix....");
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i<this.rows; i++) {
			for ( int j = 0; j<this.columns; j++) {
				System.out.printf("Enter %d th element in %d th row: ",j+1,i+1);
				this.arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Read Complete...");
	}
	public void display() {
		for ( int i = 0; i<this.arr.length; i++) {
			for ( int j=0; j<this.arr[0].length; j++) {
				System.out.print(this.arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public Matrix add(Matrix m) {
		Matrix res = new Matrix(m.rows,m.columns);
		if (this.rows == m.rows && this.columns == m.columns) {
			for ( int i = 0; i<this.rows; i++) {
				for ( int j = 0; j<this.columns; j++) {
					res.arr[i][j] = this.arr[i][j]+m.arr[i][j];
				}
			}
		} else {
			System.out.println("Matrices of unequal dimensions cannot be added; Returning empty matrix");
		}
		return res;
	}
	public void isScalar() {
		if(this.rows==1) {
			System.out.println("It's a scalar");
		} else {
			System.out.println("It's a two dimensional matrix");
		}
	}
	public Matrix multiply(Matrix m) {
		Matrix res = new Matrix(this.rows,m.columns);
		if (this.columns == m.rows) {
			for ( int i=0; i<this.rows; i++) {
				for ( int j=0; j<m.columns; j++) {
					for ( int k = 0; k<m.rows; k++) {
						res.arr[i][j] += this.arr[i][k]*m.arr[k][j];
					}
				}
			}
		} else {
			System.out.println("Incomaptible matrix dimensions, returning empty matrix");
		}
		return res;
	}
}
