import java.util.Scanner;
public class MailAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		String promptText1 = "Please enter your first name: ";
		System.out.println(promptText1);
		String firstName = in.nextLine();
		
		String promptText2 = "Please enter your last name: ";
		System.out.println(promptText2);
		String lastName = in.nextLine();
		
		String promptText3 = "Please enter your house number: ";
		System.out.println(promptText3);
		String HouseNumber = in.nextLine();
		
		String promptText4 = "Please enter your street: ";
		System.out.println(promptText4);
		String street = in.nextLine();
		
		String greeting = "Dear first last: ";
		
		greeting = greeting.replace("first", firstName);
		
		greeting = greeting.replace("last", lastName);
		System.out.println(greeting);
		
		String replacetext2 = "Please confirm that your address is HsNum Street "; 
		replacetext2 = replacetext2.replace("HsNum", HouseNumber);
		replacetext2 = replacetext2.replace("Street", street);
		System.out.println(replacetext2);
		
		String promptText5 = "Is this address correct?: ";
		System.out.println(promptText5);
		String address = in.nextLine();
		
		String replacetext3 = "Your answer is: yORn Goodbye! ";
		replacetext3 = replacetext3.replace("yORn", address);
		System.out.println(replacetext3); 
		
		
	
	
	
	}
	

}
