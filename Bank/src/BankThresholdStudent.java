import java.util.Scanner;
public class BankThresholdStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int months;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter initial balance: ");
		int bal = in.nextInt();
		
		System.out.println("Enter interest percentage: (ex. 05) ");
		double intPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(in.nextDouble(), in.nextDouble());
		
		System.out.println("Enter the threshold for your account balance to reach or 'End' ");
		double threshold = in.nextDouble();
		months = 0;
		while (myBankAccount.getBalance() < threshold) {
			months++;
			myBankAccount.calcInterest();
		}
		System.out.println("It will take " + months + "months to reach the threshold");
	}

}
