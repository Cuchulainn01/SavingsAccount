import java.util.*;

public class SavingsAccount extends Account { //1 new variable for interest, balance split into two for the reconcile method

   public double savingsInterestRate;
   public double currentBalance;
   public double newBalance;
   public int accountNumber;
   
   public SavingsAccount(double intRate, double balance) { //making sure fields are up to date
      this.currentBalance = balance;
      this.newBalance = balance;
      this.savingsInterestRate = intRate;
      this.accountNumber = generateNumber();
   }
   
   public static void reconcile() { //Not super clear on instructions, this method will be called in a for loop to produce the 12 months of output
      this.newBalance = this.currentBalance + (this.currentBalance * this.savingsInterestRate / 12);
   }
   public void toString() { //just overridden to make it say "Savings account" instead of checking
      return "Savings account: " + this.accountNumber + ", balance: $" + this.balance;
   }
   
   public static void main(String[] args) {
      //Put test methods here, make sure to make an account object