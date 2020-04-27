package com.sapient.matrix;

public class MatrixRunner {
public static void main(String[] args) {
	Matrix m = new Matrix(new int[][] {{4,5,6,9},{1,2,3,4},{5,8,7,4}});
	m.display();
	Matrix m1 = new Matrix(3,4);
	m1.readMatrix();
	m1.display();
	Matrix m2 = m.add(m1);
	m2.display();
	Matrix m3 = new Matrix(new int[][] {{1,2,3,4}});
	m3.isScalar();
	m2.isScalar();
	Matrix m4 = new Matrix(new int[][] {{4,5,6},{1,2,3},{5,8,7},{4,5,6}});
	Matrix res1 = m.multiply(m4);
	res1.display();
	Matrix res2 = m.add(m4);
	res2.display();
	Matrix res3 = m.multiply(m3);
	res3.display();
}
}
