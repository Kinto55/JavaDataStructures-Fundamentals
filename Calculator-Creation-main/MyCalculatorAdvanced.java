
/**
 * forming a advanced calculator for my MyCalculatorAdvanced here.
 *
 * @author (Markintus Morris)
 * @version (2/16/21)
 */
public class MyCalculatorAdvanced
{
    public int total;
    public double totalD;
    
    /**
     *  Sets instance varaible total & totalD to zero
     *
     * @param  none
     * @return  none
     */
    public void MyCalculatorAdvanced()
    {
       total = 0;
       totalD = 0;
    }
    
    /**
     *  Specifies variables x & y and then returns them added together
     *
     * @param  creates variables of integer x & y
     * @return    the sum of x and y
     */
    public void add(int x, int y)
    {
       total = x + y;
    }
    
    /**
     *  Specifies variables x & y and then returns them added together
     *
     * @param  creates variables of double x & y
     * @return    the sum of x and y
     */
    public void add(double x, double y)
    {
       totalD = x + y;
    }
    
    /**
     *  Specifies variables x & y and then returns them subtracted 
     *  from each other
     *
     * @param  creates variables of integer x & y
     * @return    the difference of x and y
     */
    public void subtract(int x, int y)
    {
       total = x - y;
    }
    
    /**
     *  Specifies variables x & y and then returns them subtracted 
     *  from each other
     *
     * @param  creates variables of integer x & y
     * @return    the difference of x and y
     */
    public void subtract(double x, double y)
    {
       totalD = x - y;
    }
    
    /**
     *  Specifies variables x & y and then returns them multiplied 
     *  together
     *
     * @param  creates variables of integer x & y
     * @return    the product of x and y
     */
    public void multiply(int x, int y)
    {
       total = x * y;
    }
    
    /**
     *  Specifies variables x & y and then returns them multiplied 
     *  together
     *
     * @param  creates variables of integer x & y
     * @return    the product of x and y
     */
    public void multiply(double x, double y)
    {
       totalD = x * y;
    }
    
    /**
     *  Specifies variables x & y and then returns them divided 
     *  from each other
     *
     * @param  creates variables of integer x & y
     * @return    the quotient of x and y
     */
    public void divide(int x, int y)
    {
       total = x / y;
    }
    
    /**
     *  Specifies variables x & y and then returns them divided 
     *  from each other
     *
     * @param  creates variables of integer x & y
     * @return    the quotient of x and y
     */
    public void divide(double x, double y)
    {
       totalD = x / y;
    }
    
    /**
     * 
     *
     * @param  none
     * @return   total
     */
    public int getTotal()
    {
        return total;
    }
    
    /**
     * 
     *
     * @param  none
     * @return   totalD
     */
    public double getTotalD()
    {
        return totalD;
    }
    
    /**
     * 
     *
     * @param  none
     * @return   none
     */
    public void clearTotal()
    {
        total = 0;
    }
   
    /**
     * 
     *
     * @param  none
     * @return   none
     */
    public void clearTotalD()
    {
        totalD = 0;
    }
}
