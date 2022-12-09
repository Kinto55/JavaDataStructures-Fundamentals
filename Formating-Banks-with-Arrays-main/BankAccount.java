
/**
 * Write a description of class BankAccount here.
 *
 * @author (Markintus Morris)
 * @version (3/20/21)
 */
public class BankAccount
{
    // Making an instance variable named balance that is a double.
    private double balance;
    
    // Add the  constructor (initializes instance variable to zero)
    public BankAccount()
    {
        // Sets balance to zero
        balance = 0;
    }
      // Add constructor that gives the instance variable a user-provided value.
    /**
     * Constructs a bank account with a given balance.
     * @param initialBalance = The Initial Balance
     */
    public BankAccount(double initialBalance)
    {
        // Sets balance to initialBalance
        balance = initialBalance;
    }
    // Add methods
    /**
     * Deposits money into the bank account.
     * @param amount = The Amount To Deposit.
     */
    public void deposit(double amount)
    {
        // Deposits money
        balance = balance + amount;
    }
    /**
     * Withdraws money from the bank account.
     * @param amount = The Amount To Withdraw.
     */
    public void withdraw(double amount)
    {
        // Withdraws money
        balance = balance - amount;
    }
    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance()
    {   
       return balance;
    }
}