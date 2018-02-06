import java.util.*;
public class Account { //just need an account number between 100000 and 999999, and a balance that fits in a double
   
   private int accountNumber;
   private double balance;
   
   public Account(double b) { //creates account object w/ number and balance
      this.accountNumber = generateNumber();
      this.balance = b;
   }
   public static int generateNumber() { //makes a random number, no contingency for duplicates
      Random rando = new Random();
      int i = rando.nextInt(999999) + 100000;
      return i;
   }
   public int getAcctNum() { //accessor for account number
      return this.accountNumber;
   }
   public double getBalance() { //accessor for balance
      return this.balance;
   }
   public void deposit(double d) {
      this.balance += d;
   }
   public void withdraw(double w) {
      if ((this.balance - w) < 0) {
         this.balance = 0;
      }
      else {
         this.balance -= w;
      }
   }
   public String toString() {//toString meant to be overridden by checking and savings accounts
      return "******** account: " + this.accountNumber + ", balance: $" + this.balance;
   }
   
   public static void main(String[] args) {
      //test methods here, create an account object
      Account a = new Account(400.53);
      System.out.println(a);
   }
}
      