
/**
 * Creating a BankAccount class.
 *
 * @author (Markintus Morris)
 * @version (2/9/21)
 */
public class BankAccount
{
    //create my insatnce variable named 
    private double balance;
    
  /**
   * Constructor for objects of class BankAccount
   */
  public BankAccount()
  {
      //initialize instance variables
      balance = 0;
    }
    
   /**
   * Constructor for objects of class BankAccount
   */
  public BankAccount(double initialBalance)
  {
      //initialize instance variables
      balance = initialBalance;
  }
  
  /**
   * An example of a method - replace this comment with your own
   * 
   * @param amount the amount to deposit
   * @return     none
   */
  public void deposit(double amount)
  {
      //deposits the money 
      balance = balance + amount;
  }    
  
  /**
   * withdraws moeny form your bank account
   * 
   * @param amount the amount to withdraw
   * @return     none 
   */
  public void withdraw(double amount)
  {
      //deducts the money
      balance = balance - amount;
  } 
  
  /**
   * Gets the current balance of the bank account
   * @return the current balance
   */
  public double getbalance()
  {
      return balance;
  }    
}

