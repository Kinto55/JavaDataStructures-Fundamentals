/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a rectangle
// Author: Markay Morris 
// Date: 7/17/2021 


public class Cone {
    //WHAT IT DOES:establishes the sphere surface
    //HOW IT WORKS: computes the radius and uses it to define numeric value
	
    private double r,h;

    public Cone(double radius, double height)
    {
        this.r=radius;
        this.h=height;
    }

    public double surface()
    {
        return Math.PI*r*r+Math.PI*r*Math.sqrt(r*r+h*h);
    }

    public double volume(){
        return (Math.PI/3.0)*h*r*r;

    }

}
