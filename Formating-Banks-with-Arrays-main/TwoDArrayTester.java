
/**
 * Write a description of class TwoDArrayTester here.
 *
 * @author (Markintus Morris)
 * @version (3/20/21)
 */
public class TwoDArrayTester
{
    public static void main (String[] args)
    {
         //creating a two demensional array
         int[][] twoDArray = new int[9][10];
         for( int i = 0; i < 9; i++)
         {
                for (int j = 0; j < 10; j++)
                {
                    twoDArray[i][j] = (i +1) * (j+1);
                }
         }
         for ( int i = 0; i<9; i++)
         {
            for(int j=0 ; j< 10; j++)
            {
                System.out.printf("%5D" , twoDArray[i][j]);
            }
            System.out.println("\n");
            }
    }
}
