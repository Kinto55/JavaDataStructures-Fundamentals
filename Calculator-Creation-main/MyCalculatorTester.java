
/**
 * FOrming a tester of my MyCalculatorTester here.
 *
 * @author (Markay Morris)
 * @version (2/16/21)
 */
import java.util.Scanner;
public class MyCalculatorTester
{
   public static void main(String []args)
   {
       Scanner in = new Scanner(System.in);
       //Prints the output for the X value
       System.out.println("Please enter the value for X as an integer: ");
       int X = in.nextInt();
       //Prints the output for the Y Value
       System.out.println("Please enter the value for Y as an integer: ");
       int Y = in.nextInt();
       //Prints the output for the XD value
       System.out.println("Please enter the value for XD as an integer: ");
       double XD = in.nextDouble();
       //Prints the output for the YD value
       System.out.println("Please enter the value for YD as an integer: ");
       double YD = in.nextDouble();
       //Creating a object for Mycalculator type
       MyCalculator mc = new MyCalculator();
       //Printing statments for the integers
       System.out.println(" The following output is from the integers " );
       //Calls the subtract method for the type of integers
       mc.add(X,Y);
      System.out.println(mc.add(X,Y));
      //Calls the subtract method for the type integers 
      mc.subtract(X,Y);
      //Prints the total for the subtract method for the integers
      System.out.println(mc.subtract(X,Y));
      //Calls the multiply method for the type integers 
      mc.multiply(X,Y);
      System.out.println(mc.multiply(X,Y));
      //Calls the divide method for the type integers 
      mc.divide(X,Y);
      System.out.println(mc.divide(X,Y));
      mc.add(XD,YD);
      //Prints the total for the add method for the doubles
      System.out.println(mc.add(XD,YD));
      //Calls the subtract method for the type double
      mc.subtract(XD,YD);
      //Prints the total for the subtract method for the integers
      System.out.println(mc.subtract(XD,YD));
      mc.multiply(XD,YD);
      //Prints the total for the multiply method for the doubles
      System.out.println(mc.multiply(XD,YD));
     //Calls the divide method for the type double 
     mc.divide(XD,YD);
     //Prints the totoal for the didive method for the doubles
      System.out.println(mc.divide(XD,YD));
  }
}