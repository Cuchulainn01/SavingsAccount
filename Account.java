import java.util.*;
public class Account {
   
   private int accountNumber;
   private double balance;
   
   public Account(double b) {
      this.accountNumber = generateNumber();
      this.balance = b;
   }
   public static int generateNumber() {
      Random rando = new Random();
      int i = rando.nextInt(999999) + 100000;
      return i;
   }
   public int getAcctNum() {
      return this.accountNumber;
   }
   public double getBalance() {
      return this.balance;
   }
   public static void main(String[] args) {
      //test methods here, create an account object  
   }
}
      