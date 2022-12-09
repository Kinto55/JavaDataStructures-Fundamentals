
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (Markintus Morris)
 * @version (3/20/21)
 */
public class ArrayPractice
{
    // instance variables - replace the example below with your own
    private int[] numbers = new int[20];

    /**
     * Constructor for objects of class ArrayPractice
     */
    public ArrayPractice(int[] num)
    {
        // initialise instance variables
        numbers = num;
    }

    /**
     * A method to print out array forward
     *
     * @param  none
     * @return    none
     */
    public void  printForward()
    {
        // print our heading 
        System.out.println("This prints the array forward");
        for ( int n: numbers)
        {
               System.out.print( n + " ");
        }
        System.out.println("\n");
    }
    
     /**
     * A method to print out array backward
     *
     * @param  none
     * @return    none
     */
    public void printBackward()
    {
        // print our heading 
        System.out.println("This prints the array backward");
        for (int i = numbers.length-1; i  >=  0; i--) 
        {
               System.out.print( numbers[i] + " ");
        }
        System.out.println("\n");
    }
    
     /**
     * A method to print the odd elemts of the array
     *
     * @param  none
     * @return    none
     */
    public void printOdd()
    {
        // print our heading 
        System.out.println("This prints the odd elemnts of the array");
        for (int i = 1; i < numbers.length ; i=i+2) 
        {
               System.out.print( numbers[i] + " ");
        }
        System.out.println("\n");
    }
    
     /**
     * A method to print the even elemts of the array
     *
     * @param  none
     * @return    none
     */
    public void printEven()
    {
        // print our heading 
        System.out.println("This prints the even elemnts of the array");
        for (int i = 0;i < numbers.length ; i=i+2) 
        {
               System.out.print( numbers[i] + " ");
        }
        System.out.println("\n");
    }
    
    /**
     * A method to print the even elemts of the array
     *
     * @param  none
     * @return    none
     */
    public void printFirstAndLast()
    {
        // print our heading 
        System.out.println("This prints the First and least elements");
        System.out.println(numbers[0] + "  " + numbers[numbers.length-1]);
        System.out.println("\n");
    } 
    
    /**
     * A method to print the even elemts of the array
     *
     * @param  none
     * @return    none
     */
    public void addOne()
    {
        // print our heading 
        System.out.println("Adds 1 to each element and prints");
        System.out.println(numbers[0] + "  " + numbers[numbers.length-1]);
        for( int i = 0; i< numbers.length; i++)
        {
            numbers[i] = numbers[1] +1;
        } 
        this.printForward();
        System.out.println("\n");
    } 
}
