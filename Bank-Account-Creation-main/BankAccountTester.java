
/**
 * Testing my bank account class.
 * 
 * @author (Markintus Morris)
 * @version (2/9/21)
 */
public class BankAccountTester
{
  public static void main(String[] args)
  {
    //creates a bank account belonging to harry
    BankAccount harrysChecking = new BankAccount();
    //Checks the deposit method
    harrysChecking.deposit(2000);
    //Checks the withdraw method
    harrysChecking.withdraw(500);
    //Print the balance
    System.out.println(harrysChecking.getBalance());
    //Print the expected value
    System.out.println("Expected: 1500");
  }
}