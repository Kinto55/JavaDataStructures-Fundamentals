/**
 * a class Computations here of practicing loops
 *
 * @author (Morris)
 * @version (3/6/21)
 */
public class Computations
{
    
     /**
     * method will compute the sum of even numbers
     *
     * @param int stop 
     * @return    the sum of x and y
     */
    public int computeEvenSums(int stop)
    {
        //create a var named sum
        int sum = 0;
        //loop that begins at 2 and ends ar stop
        for(int i = 2; i <=stop; i = i+2)
        {
           sum = sum + i;
        }
        return sum;
    }
    
    /**
     * sum all squares
     * 
     * @param int stop 
     * @retun int sum
     * 
     */
     public int sumAllSquares(int stop)
    {
       int sum = 0;
       int square = 0;
       for (int i = 1; i<=stop; i++)
       {
          square = i * i;
          sum = sum + square;
        }
        return sum;
    } 
    
    /*
     * compute all odd sums 
     * @param int start, int stop 
     * @return int sum
     */
    public int computeOddSums(int start, int stop)
    {
        int sum = 0;
        for (int i = start; i<= stop; i = i+2)
        {
           sum = sum + i;
        }
        return sum;
    }
    
    /*
     * calculate all of the powers of 2(a number)
     * @ int start, int stop
     * @return double power 
     */
    public double calculateAllPowers(int p)
    {
        //creatinf a var named power
        double power = 0;
        
        
        power = Math.pow(2,p);
        //return the power 
        return power;
    }
    
}
