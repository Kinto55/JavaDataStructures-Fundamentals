import java.util.Scanner;
/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a rectangle
// Author: Markay Morris 
// Date: 7/17/2021 

public class Geometry1 {
	//WHAT IT DOES:establishes that there is bese radius 
	//HOW IT WORKS: computes the volume and uses it to define numeric values

	private static Scanner input;

	public static void main(String[] args) {
		//WHAT IT DOES:establishes the basic captions and prints the,
	    //HOW IT WORKS: computes the radius and uses it to undrstandably determine formulas 
	
		double radius, height;
		input = new Scanner(System.in);
		System.out.println("Please enter the radius : ");
		radius = input.nextDouble();
		System.out.println("Please Enter the height : ");
		height = input.nextDouble();
		Sphere ball = new Sphere(radius);
		Cylinder cyl = new Cylinder(radius, height);
		Cone cone = new Cone(radius, height);
		Cube cube = new Cube(height);
		
		System.out.println("Surface Area of Cube: " + cube.surface());
		System.out.println("Volume of Cube: " + cube.volume());
		System.out.println("Surface Area of Sphere: " + ball.surface());
		System.out.println("Volume of Sphere: " + ball.volume());
		System.out.println("Surface Area of Cylinder: " + cyl.surface());
		System.out.println("Volume of Cylinder: " + cyl.volume());
		System.out.println("Surface Area of Cone: " + cone.surface());
		System.out.println("Volume of Cone: " + cone.volume());
	}

}
