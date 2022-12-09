
/**
 * Write a description of class NameTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NameTester
{
  public static void main(String[] args)
  {
    //Create a acanner 
    Scanner in = new Scanner(System.in);
    
    //prompt for your first time
    System.out.println("What is your first name?" );
    String firstName = in.nextLine();
   

    //prompt for your last name
    System.out.println("What is your last name?" );
    String lastName = in.nextLine();
    
    //create a varible to hold a blank
    String blank = "";
    //concating to get our full name
    String fullName = firstName + blank + lastName;
    
    
    System.out.println( fullName.substring(0,1));
    System.out.println( fullName.substring(1,2));
    System.out.println( fullName.substring(2,3));
    System.out.println( fullName.substring(3,4));
    System.out.println( fullName.substring(5));
    }
    
}
