import java.awt.Rectangle;

/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a rectangle
// Author: Markay Morris 
// Date: 7/17/2021 

public class BetterRectangle1 extends Rectangle {

	//WHAT IT DOES: impliements a rectangle
	//HOW IT WORKS: returns the each angle and size of the rectangle with precision
	public BetterRectangle1(int x, int y, int width, int height) {
        setLocation(x,y);
        setSize(width, height);
	}

	public double getPerimeter() {
		//WHAT IT DOES: PERIMETER to height and width of the rectandle 
		//HOW IT WORKS: returns the WIDTH/HEIGHT of the bounding rectangle in a double precisive way.(Doubles the reactnagle)
		return getHeight() * 2 + getWidth() * 2;
	}

	public double getArea() {
		//WHAT IT DOES: puts the width and height together
		//HOW IT WORKS: multiplies the area of width and heighth to get an accurate number for the rectangle 
		return getHeight() * getWidth();
	}

	public static void main(String[] args) {
		//WHAT IT DOES :GETS THE Area AND PERIMETER of a Rectangle
		//HOW IT WORKS: Uses double to get the accurate perimeter and area
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