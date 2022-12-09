
/**
 * Creating a BankAccount class.
 *
 * @author (Markintus Morris)
 * @version (2/9/21)
 */
public class BankAccountWithName
{
    //create my insatnce variable named 
    private double balance;
    private String name;
    
  /**
   * Constructor for objects of class BankAccount
   */
  public BankAccountWithName()
   {
      //initialize instance variables
      balance = 0;
      name = "Jane Doe";
  }
    
   /** Constructs for objects of class BankAccount
   * @ param initial balance the initial balance 
   */
  public BankAccountWithName(double initialBalance, String n)
   {
      //initialize instance variables
      balance = initialBalance;
      name = n;
  }
  
  /**deposits money into the bank account
   * @param amount he amount deposit
   */
  public void deposit(double amount)
   {
      balance = balance + amount;
  }    
  
  /**
   * withdraws moeny form your bank account
   * 
   * @param amount the amoutnt to withdraw
   * @retuen     none 
   */
  public void withdraw(double amount)
   {
      //deposits the money
      balance = balance - amount;
  } 
  
  /**
   * Gets the current balance of the bank account
   * @return the current balance
   */
  public double getbalance()
   {
      //return the balance
      return balance;
  }   
  
   /**
   * Return the name of the account
   * 
   * @parm none 
   * @return name
   */
   public String getName()
  {
     return name;

    }
}


