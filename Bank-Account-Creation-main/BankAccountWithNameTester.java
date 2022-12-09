
/**
 * Tests my bank account class.
 *
 * @author (Markintus Morris)
 * @version (2/9/21)
 */
public class BankAccountWithNameTester
{
    public static void main(String[] agrs)
  {
    //creates a bank account belonging to harry
    BankAccountWithName harrysChecking = new BankAccountWithName();
    //checks the deposit method
    harrysChecking.deposit(2000);
    //checks the withdraw method
    harrysChecking.withdraw(500);
    //print the balance
    System.out.println(harrysChecking.getBalance());
    //prints the expected value
    System.out.println("Expected: 1500");
    //Create a BankAccount for sue
    BankAccountWithName sueAccount = new BankAccountWithName(300, "Sue");
    //Print the name and balance of the Bank Account
    System.out.println(sueAccount.getName());
    System.out.println(sueAccount.getBalance());
   }
}