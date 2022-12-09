/**
 * We are practicing Loops here.
 *
 * @author (Markintus Morris)
 * @version (3/6/21)
 */
public class Loops
{
    /**
     * Calculate the average of all numbers from 1 to stop using a while loop
     *
     * @param  int stop 
     * @return    sum/count
     */
    public double usingWhileLoops(int stop)
    {
        // creating some local varibles here
        int begin = 1;
        double sum = 0;
        int count = 0; 
        //set up my loop
        while (count <= stop)
        {
             sum = sum + count;
             count++;
        }
        return sum/count;
        
    }
    
        
    /**
     * Calculate the average of all numbers from 1 to stop using a while loop
     *
     * @param  int stop 
     * @return    sum/count
     */
    public double usingForLoops(int stop)
    {
        // creating some local varibles here
        int begin = 1;
        double sum = 0;
        int count = 0; 
        //set up my loop
        for (count = 0; count<= stop; count++)
        {
             sum = sum + count;
        }
        return sum/count;
        
    }
    
    /**
     * Calculate the average of all numbers from 1 to stop using a while loop
     *
     * @param  int stop 
     * @return    sum/count
     */
    public double usingDoLoops(int stop)
    {
        // creating some local varibles here
        
        double sum = 0;
        int count = 0; 
        //set up my loop
        do
        {
             sum = sum + count;
             count++;
        }
        while(count<= stop);
        return sum/count;
        
    }
    
}
