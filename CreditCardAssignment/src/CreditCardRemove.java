import java.util.*;
public class CreditCardRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String CreditCardNum;
		
		System.out.println("Enter card number or -99 to end: ");
		
		while (in.hasNextLine()) {
			
		CreditCardNum = in.nextLine();
		
		
		if (CreditCardNum.equals ("-99")) {
			System.out.println("Goodbye");
			break;
		}
		
		
		
		int i = 0;
		
		char bb;
		while(i < CreditCardNum.length()) 
		{
			bb = CreditCardNum.charAt(i);
			
			if (bb == ' ' || bb == '-') 
			{
		
			String before = CreditCardNum.substring(0,i);
			String after = CreditCardNum.substring(i + 1);
			CreditCardNum = before + after;
	}
			else 
			{
				i = i+1;
			}
		
		}
 		System.out.println(CreditCardNum);
		System.out.println("Enter card number or -99 to end: ");

 		}}}

