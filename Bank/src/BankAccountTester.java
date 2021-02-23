import java.util.Scanner;
public class BankAccountTester {
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter starting balance: ");
		double startBal = in.nextDouble();
		
		
	BankAccount myBankAccount = new BankAccount(startBal);  	// object of the class 
	
	System.out.println("How much would you like to deposit?: ");
	double depositAmount = in.nextDouble();
	myBankAccount.deposit(depositAmount);					// this calls the deposit method from BankAccount
	
	System.out.println("How much would you like to withdraw?: ");
	double withdrawAmount = in.nextDouble();
	myBankAccount.withdraw(withdrawAmount);
	
	System.out.println("Your balance is: " + myBankAccount.getBalance());
	
	
		
		
		
		
		
	}

}
