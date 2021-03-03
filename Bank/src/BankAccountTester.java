import java.util.Scanner;
public class BankAccountTester {
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an amount to start the account: ");
		double startBal = in.nextDouble();
		
		System.out.println("Enter the interest rate for the account: ");
		double interestPct = in.nextDouble();
		
		
	BankAccount myBankAccount = new BankAccount(startBal, interestPct);// object of the class 
	
	
	System.out.println("Enter amount to deposit in the account: ");
	double depositAmount = in.nextDouble();
	myBankAccount.deposit(depositAmount);					// this calls the deposit method from BankAccount
	
	
	System.out.println("Enter an amount to withdraw from the account: ");
	double withdrawAmount = in.nextDouble();
	myBankAccount.withdraw(withdrawAmount);
	
	System.out.println("Enter an amount to withdraw from the account: ");
	withdrawAmount = in.nextDouble();
	myBankAccount.withdraw(withdrawAmount);
	
	
	
	System.out.println("If you want me to generate interest, enter 'Yes'");
	String fr = in.next();
	
	if (fr.equals ("Yes")) {
		myBankAccount.calcInterest();
	}
	
	
	
	
	System.out.println("Your balance is: " + myBankAccount.getBalance());
	
	
		
		
		
		
		
	}

}
