import java.util.Scanner;

/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a rectangle
// Author: Markay Morris 
// Date: 7/17/2021 
public class Geometry {

	private static Scanner input;

	public static void main(String[] args) {
		//WHAT IT DOES: allows user to input radius values 
	   //HOW IT WORKS: computes the volume and uses it to define numeric values.As well as prints the volumes and areas
		double radius, height;
		input = new Scanner(System.in);
		System.out.println("Please enter the radius : ");
		radius = input.nextDouble();
		System.out.println("Please Enter the height : ");
		height = input.nextDouble();

		System.out.println("Surface Area of Cube: " + cubeSurface(height));
		System.out.println("Volume of Cube: " + cubeVolume(height));
		System.out.println("Surface Area of Sphere: " + sphereSurface(radius));
		System.out.println("Volume of Sphere: " + sphereVolume(radius));
		System.out.println("Surface Area of Cylinder: " + cylinderSurface(radius, height));
		System.out.println("Volume of Cylinder: " + cylinderVolume(radius, height));
		System.out.println("Surface Area of Cone: " + coneSurface(radius, height));
		System.out.println("Volume of Cone: " + coneVolume(radius, height));

	}

		public static double cubeVolume(double h) {
		return h * h * h;
		//WHAT IT DOES:establishes that there is bese height 
	    //HOW IT WORKS: computes the volume and uses it to define numeric values

	}

	public static double cubeSurface(double h) {
		//WHAT IT DOES:establishes that there is bese height 
	   //HOW IT WORKS: computes the surface height and uses it to define numeric values
		return 6 * h * h;

	}

	public static double sphereVolume(double r) {
		//WHAT IT DOES:establishes the sphere radius 
	    //HOW IT WORKS: computes the volume and uses it to define numeric values
		return (4.0 / 3.0) * Math.PI * r * r * r;
	}

	public static double sphereSurface(double r) {
		//WHAT IT DOES:establishes the sphere surface
	    //HOW IT WORKS: computes the radius and uses it to define numeric values
		return 4.0 * Math.PI * r * r;
	}

	public static double cylinderVolume(double r, double h) {
		//WHAT IT DOES:establishes the cylinder volume
	    //HOW IT WORKS: computes the radius and uses it to define numeric value
		return h * Math.PI * r * r;
	}

	public static double cylinderSurface(double r, double h) {
		//WHAT IT DOES:establishes the cylidar surface with height and radius
	    //HOW IT WORKS: computes the radius/height with multiplucation and addidtion and uses it to define numeric value
		return (2.0 * r * Math.PI * h) + (2.0 * Math.PI * r * r);
	}

	public static double coneVolume(double r, double h) {
		//WHAT IT DOES:establishes the cone volume
	    //HOW IT WORKS: computes the radius/height, uses area formula, and uses it to define numeric value
		return Math.PI / 3.0 * r * r * h;
	}

	public static double coneSurface(double r, double h) {
		//WHAT IT DOES:establishes the cone surface
	    //HOW IT WORKS: computes the radius/height and uses it to define numeric value
		return Math.PI * r * r + Math.PI * r * Math.sqrt(r * r + h * h);
	}

}
