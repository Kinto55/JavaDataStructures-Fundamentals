/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a rectangle
// Author: Markay Morris 
// Date: 7/17/2021 

public class Cube {
	//WHAT IT DOES:establishes that there is bese radius 
	//HOW IT WORKS: computes the volume and uses it to define numeric values
	private double h;

	public Cube(double height) {
		this.h = height;
	}

	public double surface() {
		return 6 * h * h;
	}

	public double volume() {
		return h * h * h;

	}
}
