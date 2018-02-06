import java.util.*;
public class CheckingAccount extends Account {
   
   private double monthlyFee;
   private double minimumBalance;
   
   public CheckingAccount(double b, double fee, double min) {
      super(b);
      this.monthlyFee = fee;
      this.minimumBalance = min;
   }
   
   public void reconcile() {
      if (this.getBalance() < this.minimumBalance) {
         withdraw(this.monthlyFee);
      }
   }
   public String toString() {
      return "Checking account: " + this.getAcctNum() + ", balance: $" + this.getBalance();
   }
   public static void main(String[] args) {
      CheckingAccount b = new CheckingAccount(400.00, 20.00, 390.00);
      System.out.println(b);
      b.withdraw(15.00);
      b.reconcile();
      System.out.println(b);
   }
}

