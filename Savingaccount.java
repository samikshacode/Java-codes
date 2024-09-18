import java.util.Scanner;
public class Savingaccount
{
   private double savingBalance;
   private static double InterestRate;
 
   public Savingaccount(double balance)
   {
      this.savingBalance=balance;
   }

   public void calculateMonthlyInterest()
   {
      double monthlyInterest=(savingBalance * InterestRate/12)/100;
      savingBalance +=monthlyInterest;
   }
  
   public void printsavingBalance()
   {
     System.out.printf("Saving Balance: Rs %2f %n",savingBalance);
   }
   
   public static void modifyInterestRate(double newRate)
   {
     InterestRate= newRate;
   }
   
   public static void main(String []args)
   {
      Savingaccount saver1=new Savingaccount(2000.0);
      Savingaccount saver2=new Savingaccount(3000.0);
    
    Savingaccount.modifyInterestRate(4.0);
    System.out.println("Balance with 4% interest rate: ");
    saver1.calculateMonthlyInterest();
    saver1.printsavingBalance();
    saver2.calculateMonthlyInterest();
    saver2.printsavingBalance();
   
    Savingaccount.modifyInterestRate(5.0);
    System.out.println("Balance with 5% interest rate: ");
    saver1.calculateMonthlyInterest();
    saver1.printsavingBalance();
    saver2.calculateMonthlyInterest();
    saver2.printsavingBalance();

   }
}

   
   
   

   