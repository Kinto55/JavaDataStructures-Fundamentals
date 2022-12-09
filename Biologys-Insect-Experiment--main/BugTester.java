
/**
 * Write a description of class BugTester here.
 *
 * @author (Markintus Morris)
 * @version (6/13/21)
 */
import java.util.Scanner;
public class BugTester
{
    public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
       //Prompt for the number of bugs 
       System.out.println("Please enter the initial number of bugs");
       //get the bug count
       int bugs = in.nextInt();
       
       //Create a bug object
       Bug bugSim = new Bug(bugs);
       
       //breeding bugs using a while loop
       int count = 1;
       while (count <=4)
        {
           bugSim.breedBugs();
           count++;
        }
       
        //need to reset count
        count=1;
        //spray bugs using a do loop
       do
         {
            bugSim.sprayBugs();
            count++;
         }
       while(count <=4);  
       
       //Spray number of bugs
       System.out.println("After spraying and breeding the number of bugs is: " + bugSim.getBugs());  
    }
}
