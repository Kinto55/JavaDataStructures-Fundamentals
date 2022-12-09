/**
 * a class ComputationsTester here. Testing Computations 
 *
 * @author (Markintus Morris)
 * @version (3/6/21)
 */
import java.util.Scanner;
public class ComputationsTester
{
    public static void main(String[] args)
    {
       //create a scanner object
       Scanner in =new Scanner(System.in);
       
       //Creating a computation object
       Computations comp = new Computations();
       
       //prpmpt to stop value for computing even numbers
       System.out.println("Eneter a value to stop computing even numbers");
       int stopE = in.nextInt();
       
       //create a varible named sum and set it to 0
       int sum = 0;
       //call the computeEvenSum
       sum = comp.computeEvenSums(stopE);
       
       //print the output
        System.out.println( "The sums of all even numbers from 0 to " + stopE + " is: " + sum + "/n");
       
       //prompt for stop value for computing sum of the squares 
       System.out.println( "enter a value to stop computing sum of squares");
       stopE = in.nextInt();
       //call the sumAllSquares method 
       sum = comp.sumAllSquares(stopE);
       //print the output
       System.out.println("The sum of all squares from 1 to " + stopE + " is: " + sum + "/n");
       
       //prpmpt for a start and stop value for computeOddSums
       System.out.println("Please enter a start value for compute all odd sums");
       int start = in.nextInt();
       System.out.println("Please enter a start and stop value for compute all odd sums");
       stopE = in.nextInt();
       //call the computeOddSUms method 
       sum = comp.computeOddSums(start,stopE);
       //print the output
       System.out.println("The sum of all odd values from " + start + " to " + stopE + " is: " + sum + "/n");
       
       //prompt the user for a vlue to stop computing the powers
       System.out.println("please enter a value to stop computing the powers");
       stopE = in.nextInt();
       //create a double varible
       double value = 0;
       //create a loop to call the power method and print the result
       for (int i=0; i < stopE; i++)
       {
            value = comp.calculateAllPowers(i); 
            System.out.println("The power of 2 to" + i + " is " + value);
        }
       
    }
}
