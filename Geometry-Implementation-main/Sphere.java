/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a Sphere
// Author: Markay Morris 
// Date: 7/17/2021 

public class Sphere {
	//WHAT IT DOES:establishes that there is bese radius 
	//HOW IT WORKS: computes the volume and uses it to define numeric values
	private double r;

	public Sphere(double radius) {
		this.r = radius;
	}

	public double surface() {
		return 4.0 * Math.PI * r * r;
	}

	public double volume() {
		return (4.0 / 3.0) * Math.PI * r * r * r;

	}

}
