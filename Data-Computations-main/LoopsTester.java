/**
 * class for loops tobe tested here.
 *
 * @author (Markintus Morris)
 * @version (3/6/21)
 */
import java.util.Scanner;
public class LoopsTester
{
    public static void main(String[] args)
   {
         //create a Scanner object
         Scanner in = new Scanner(System.in);
         //prompt the user for a stop value
         System.out.println("Please enter a stop value");
         int stop =in.nextInt();
         //.Create a loops object
         Loops loopy = new Loops();
         
          
          //call the methods and print the new results
         System.out.println("The average of 1 to " + stop + "with the while loop is " + loopy.usingWhileLoops(stop));
         System.out.println("The average of 1 to " + stop + "with the while loop is " + loopy.usingForLoops(stop));
         System.out.println("The average of 1 to " + stop + "with the while loop is " + loopy.usingDoLoops(stop));
    }
}