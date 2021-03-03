public class BankAccount
{
   private double balance;
   
   private double interestPct;
   

  
  
   
  
   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double amount, double intpct)
   {
      balance = amount;
      interestPct = intpct;
      System.out.println("     Created new bank account with " + amount + " and interest rate " + interestPct);
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
      System.out.println("      Deposited: " + amount);
      
      
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
      
      if (amount > balance) {
    	  System.out.println("Insufficient funds please try again. ");
      }
      else {
    	  balance = balance - amount;
    	  System.out.println("      Withdrew: " + amount);
      }
   }
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
	   return balance;
   }
   public void calcInterest() {
	   double amt = balance * interestPct;
	   
	   balance = balance + amt;
		  System.out.println("      Interest: " + amt);
   }
}


