
/**
 * Write a description of class Change here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Change
{
   //Instance varibles - replace the example with your own
   private int amount;
   private int quarters;
   private int dimes;
   private int nickels;
   private int pennies;
   
   //static varibles 
   public static final int QUARTER_VALUE = 25;
   public static final int DIME_VALUE = 10;
   public static final int NICKEL_VALUE = 5;
   public static final int PENNIE_VALUE = 1;
   
   /**
    * 
    * Constructor for objects class change
    */
   public Change(int amount)
   {
     //initialize instance varibles 
     this.amount = amount;
     quarters = 0;
     dimes = 0;
     nickels = 0;
     pennies = 0;

    }
    
    /**
    * Calculates the number of quarters 
    * 
    * @param none
    * @return none
    */
   public void calculateQuarters()
   {
     //calculate the number of quarters 
     quarters = amount / QUARTER_VALUE;
     int remainder = amount % QUARTER_VALUE;
     amount= remainder;
   }
   
   /**
    * Calculates the number of Dimes 
    * 
    * @param none
    * @return none
    */
   public void calculateDimes()
   {
     //calculate the number of Dimes
     dimes = amount / DIME_VALUE;
     int remainder = amount % DIME_VALUE;
     amount= remainder;
   }
   
   /**
    * Calculates the number of NICKel
    * 
    * @param none
    * @return none
    * 
    */
   public void calculateNickels()
   {
    //caclulate the number of quarters
     nickels = amount / NICKEL_VALUE;
    //gets remainder of the amount
    int remainder = amount % NICKEL_VALUE;
    //assigns amount the value of remainder
    amount = remainder;
    
    }
   
    /**
    * Calculates the number of Penneis
    * 
    * @param none
    * @return none
    * 
    */
   public void calculatePennies()
   {
    //caclulate the number of quarters
     pennies = amount / PENNIE_VALUE;
    //gets remainder of the amount
    int remainder = amount % PENNIE_VALUE;
    //assigns amount the value pf remainder
    amount = remainder;
    
    }

   /**
     * 
     * retunrs the number of quarters 
     * 
     * @param none
     * @return quarters 
     * 
     * 
     */
    public int getQuarters()
  { 
    return quarters;
  }
  
  /**
  * \Returns the number of dimes
  * 
  * @param none 
  * @return dimes
  */
  public int getDimes()
  {
    return dimes;
   }
    
  /**
  * \Returns the number of Nickles
  * 
  * @param none 
  * @return nickles
  */
  public int getNickles()
  {
    return nickels;
    } 
  
  /**
  * \Returns the number of Pennies
  * 
  * @param none 
  * @return pennies
  */
  public int getPennies()
  {
    return pennies;
   }
  
}