public class Bank {
   public static void main(String[] args) {
      SavingsAccount a = new SavingsAccount(250.94, 1);
      SavingsAccount b = new SavingsAccount(7450.23, 6);
      CheckingAccount c = new CheckingAccount(14543.56, 500.00, 35.00);
      CheckingAccount d = new CheckingAccount(123.34, 30.54, 100.00);
      CheckingAccount e = new CheckingAccount(324.75, 200.00, 10.00);
      Account[] bank = {a, b, c, d, e};
      for(int month = 1; month < 13; month++) {
         System.out.println("After month " + month);
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
         a.reconcile();
         b.reconcile();
         c.reconcile();
         d.reconcile();
         e.reconcile();
         System.out.println();
      }
   }
}

