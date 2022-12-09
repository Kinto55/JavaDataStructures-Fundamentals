
/**
 * Creating a simple Payroll 
 *
 * @author (Markintus Morris )
 * @version (3/2/21)
 */
public class Payroll
{
   //define instance varible
   public int payCheck; 
   public String name;
   
   /**
    * Default Constructor for objects of class Payroll
    */
   public Payroll()
   {
       //initalize instance variables
       payCheck= 0 ;
       name = " " ;
    }
    
    /**
    * Default Constructor for objects of class Payroll
    */
   public Payroll(String argument)
   {
       //initalize instance variables
       payCheck= 0 ;
       name = name;
    }
   
   /**
    * @param 
    * @return none
    */
   public void calculatePaycheck(int hoursWorked, int payRate)
   {
       //Simply calculating the Pay Check
       payCheck = hoursWorked * payRate; 
    }
    
   /**
     * 
     * @param 
     * @return
     */
    public String getName()
    {
       return name; 
    }
    
   public int getPayCheck()
    {
      return payCheck;
    }
    
}
