package com.sapient.shapes;

public class Shapes {
	private static int numberOfSides;
	public static void main(String[] args) {
		numberOfSides = 3;
		calculateShapeArea("Triangle", 12);
		numberOfSides = 4;
		calculateShapeArea("Sqaure", 15);
		numberOfSides = 5;
		calculateShapeArea("Pentagon", 15);
		
	}
	protected static String calculateShapeArea(String name, double length) {
		double area = 0;
		if (Shapes.numberOfSides == 3) {
			Triangle t = new Triangle(length);
			area = t.calculateArea();
		} else if (Shapes.numberOfSides == 1) {
			Circle c = new Circle(length);
			area = c.calculateArea();
		} else if (Shapes.numberOfSides == 4) {
			Square s = new Square(length);
			area = s.calculateArea();
		} else {
			System.out.println("No Shapes Present");
			return "Failed!!!";
		}
		System.out.printf("The Area of %s is %.4f\n",name,area);
		return "Success!!";
	}
}
