package com.sapient.shapes;

public class Triangle {
	private double side;
	public Triangle(double length) {
		this.side = length;
	}
	protected double calculateArea() {
		return 0.433*this.side*this.side;
	}

}
