import java.awt.Rectangle;

/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a better rectangle2
// Author: Markay Morris 
// Date: 7/17/2021 

public class BetterRectangle2 extends Rectangle {

	public BetterRectangle2(int x, int y, int width, int height) {
		//WHAT IT DOES: super used to access superclass members in a subclass
		//HOW IT WORKS: seperates constructors, attributes, and methods
        super(x,y,width,height);
	}

	public double getPerimeter() {
		//WHAT IT DOES: implemets the perimeter
		//HOW IT WORKS: adds the width and height together
		return getHeight() * 2 + getWidth() * 2;
	}

	public double getArea() {
		//WHAT IT DOES: implemets the area
		//HOW IT WORKS: multiplies the width and height together

		return getHeight() * getWidth();
	}

	public static void main(String[] args) {
		//WHAT IT DOES: implemets the proper solutions of a rectangle
		//HOW IT WORKS: adds and multiplies the width and height together
		int x = 5;
		int y = 10;
		int width = 10;
		int height = 20;
		BetterRectangle1 rectangle = new BetterRectangle1(x, y, width, height);
		double area = rectangle.getArea();
		double perimeter = rectangle.getPerimeter();
		System.out.println("Area of a Rectangle is:" + area);
		System.out.println("Perimeter of a Rectangle is: " + perimeter);
	
	}

}