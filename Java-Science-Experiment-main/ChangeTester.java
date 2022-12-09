
/**
 * Write a description of class ChangeTester here.
 *
 * @author (Markintus Morris)
 * @version (2/16/21)
 */
import java.util.Scanner;
public class ChangeTester
{
   public static void main(String[] args)
   {
       //Create a scanner
       Scanner in = new Scanner(System.in);
       
       //promp and input for our value
       System.out.println("Please enter an amount");
       int value = in.nextInt();
       
       //Create our object
       Change makeChange = new Change(value);
       
       //call the calculate quarters method
       makeChange.calculateQuarters();
       
       //call the calculate dimes method
       makeChange.calculateDimes();
       
       //call calculate nickles method
       makeChange.calculateNickels();
       
       //call the calculate pennies method
       makeChange.calculatePennies();
       
       //PRINTING THE RESULTS
       System.out.println(" The number of quarters is : " + makeChange.getQuarters());
       System.out.println(" The number of dimes is : " + makeChange.getDimes());
       System.out.println(" The number of nickles is : " + makeChange.getNickles());
       System.out.println(" The number of pennies is : " + makeChange.getPennies());
       
  }
  
}
