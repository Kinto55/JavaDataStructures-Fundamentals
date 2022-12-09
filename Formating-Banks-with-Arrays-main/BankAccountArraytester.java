
/**
 * Write a description of class BankAccountArraytester here.
 *
 * @author (Markintus )
 * @version (3/20/21)
 */
import java.util.Scanner;
public class BankAccountArraytester
{
  public static void main (String[] args)
  {
     //create an array of type of BankAccount
     BankAccount[] bankAccount = new BankAccount[10];
     //loope to add to BnakAccount
     for(int i = 0; i < bankAccount.length; i++)
     {
         System.out.println("Please enter an openeing balance");
         double opening =in.nextDouble();
         BankAccount account = new BankAccount(opening);
         bankAccount[i] = account;
     }
     
     for(int i = 0; i < bankAccount.length; i++)
     {
        System.out.println("balance for the account" + i + "is" + bankAccount[i].getBalance()); 
     }
}
}