
/**
 * Testing my PayrollTester for this class here.
 *
 * @author (Markintus morris )
 * @version (3/2/21)
 */
public class PayrollTester
{
    public static void main(String[] args)
    {
        //instance Payroll for dummy
        Payroll Dummy = new Payroll();
        //instance Payroll for me 
        Payroll me = new Payroll();
        //Printting my name Bossy Markintus
        System.out.println("Name : Bossy Markintus" + Dummy.getName());
        //Printing the numer first Paycheck value 
        System.out.println("Paycheck 1: Value " + Dummy.getPayCheck());
        //Calculating the paycheck number
        me.calculatePaycheck(40,10);
        //Prints my name Bossy Markintus 
        System.out.println( "Name: Bossy Markintus " + me.getName());
        //Printing the second Paycheck value
        System.out.println(" Paycheck 2 Value: " + me.getPayCheck());

    }
}
