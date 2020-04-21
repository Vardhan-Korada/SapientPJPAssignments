package com.sapient.shapes;

public class Circle {
	private double radius;
	public Circle(double length) {
		this.radius = length;
	}
	protected double calculateArea() {
		return 3.14*radius*radius;
	}
}
