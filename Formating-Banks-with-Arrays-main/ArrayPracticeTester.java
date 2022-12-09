
/**
 * Test my arrayPractice class
 *
 * @author (Markintus Morris)
 * @version (4/20/21)
 */
import java.util.Random;
public class ArrayPracticeTester
{
    public static void main(String[] args)
    {
      //Create an integer arrray na,ed values to hold 20 elemts
      int[] values = new int[20];
      //creating random number generator
      Random generator = new Random();
      //for loop to fill the array with ranmdom numbers 
      for(int i=0; i < values.length; i++)
      {
          values[i]= 1 + generator.nextInt(100);
      }
      
      //create ansd array practive object
      ArrayPractice ap=new ArrayPractice(values);
      //call each method
      ap.printForward();
      ap.printBackward();
      ap.printOdd();
      ap.printEven();
      ap.printFirstAndLast();
      ap.addOne();
      
      
    }
    
}
