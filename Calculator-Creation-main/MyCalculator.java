
/**
 * We are going to be forming a simple calculator that multiplies adds,divides and subtracts numbers.
 *
 * @author (Markay Morris)
 * @version ( 2/16/21 )
 */
public class MyCalculator
{
   /**
    * A  method to add both x and y values 
    * 
    * @PARAM int x AND int y
    * @return  the sum of x and y
    */
   public int add(int x,int y)
   {
    //returns the sum of x and y of the type int
    return x + y;
   }
   
   /**
    * A method to add btoh x and y values 
    * 
    * @param double x and double y 
    * @return the sum of double x and double y 
    * 
    */
   public double add(double x, double y)
   {
    //returns the sum of x and y of the type double
    return x + y; 
    }
    
   /**
     * A method to subtracts both x and y values
     *
     *@param int x and int y 
     *@return  the diffrence of x and y 
     */
    public int subtracts(int x,int y)
   {
     //Returns the diffrence of x and y the type int 
     return x - y;
   }
   
   /**
    * A method to subtract both x and y values 
    * 
    * @paramdouble x and double y 
    * @RETURN THE DIFFRENCE OF DOUBLE X AND Y
    * 
    */
   public double subtract(double x, double y)
   {
    //Returns the difference of x and y of the type double
    return x - y;
    }
    
    /**
     * A method to multiply both x and y values
     * @param int x and int y
     * @return the prodcut of x and y 
     * 
     */
    public int multiply(int x,int y)
    {
     //Returns the product of x and y of the type of int
     return x * y;
    }
    
    /**
     * A method to multiply both x and y values 
     * 
     * @param double x and double y 
     * @return  the product of x and y 
     */
    public double multiply(double x,double y)
    {
      //returns the product of X and Y of the Type double
      return x * y; 
    }
    
    /** 
     * A method to divide both x and y values 
     * 
     * @param int x and int y
     * @return the quotient of double x and double y 
     * 
     */
    public int divide(int x, int y)
    {
     //returns the quoteint of x and y of the type double 
     return x/y;
    }
    
    /** 
     * A method to divide both x and y values 
     * 
     * @param double x and double y
     * @return the quotient of double x and double y 
     * 
     */
    public double divide(double x, double y)
    {
     //returns the quoteint of x and y of the type double 
     return x/y;
    }
    
}