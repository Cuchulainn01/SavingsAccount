import java.util.*;

public class SavingsAccount extends Account { //1 new variable for interest, balance split into two for the reconcile method

   private int savingsInterestRate;
      
   public SavingsAccount(double balance, double intRate) { //making sure fields are up to date
      super(balance);
      this.savingsInterestRate = intRate;
   }
   
   public static void reconcile() { //Not super clear on instructions, this method will be called in a for loop to produce the 12 months of output
      deposit(this.getBalance() * this.savingsInterestRate / 12);
   }
   public void toString() { //just overridden to make it say "Savings account" instead of checking
      return "Savings account: " + this.getAcctNum() + ", balance: $" + this.balance;
   }
   
   public static void main(String[] args) { //Put test methods here, make sure to make an account object
      SavingsAccount a = new SavingsAccount(400.00, 2);
      System.out.println(a);
      a.reconcile();
      System.out.println(a);
   }
}