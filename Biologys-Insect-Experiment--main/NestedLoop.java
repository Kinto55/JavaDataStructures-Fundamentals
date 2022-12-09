
/**
 * Write a description of class NestedLoop here.
 *
 * @author (Markintus Morris)
 * @version (3/13/21)
 */
public class NestedLoop
{
 public static void main (String[] args)
  {
      //doing multiplication table using nested loops
      //the outside look will be established as the rose
             for (int i = 1; i <= 9; i++)
            {
         //the inside loop will be the colums 
         for (int j = 1; j<= 10; j++)
        {
             //calculate the value of i * j
             int value = i*j;
             //printing the value statemnt here
             System.out.printf ("%5d", value);          
        }
    
        //we need to create a new line 
        System.out.print();
     }
  }
