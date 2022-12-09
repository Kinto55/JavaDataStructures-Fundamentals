/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a rectangle
// Author: Markay Morris 
// Date: 7/17/2021 


public class Cylinder {
    //WHAT IT DOES:establishes that there is base radius 
	//HOW IT WORKS: computes the volume and uses it to define numeric values

    private double r,h;

    public Cylinder(double radius, double height)
    {
        this.r=radius;
        this.h=height;
    }

	public double surface() {
		return (2.0 * r * Math.PI * h) + (2.0 * Math.PI * r * r);
	}

	public double volume() {
		return h * Math.PI * r * r;

	}

}
