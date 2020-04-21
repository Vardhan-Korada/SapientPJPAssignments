package com.sapient.shapes;

public class Square {
	private double side;
	public Square(double length) {
		this.side = length;
	}
	protected double calculateArea() {
		return this.side*this.side;
	}
}
