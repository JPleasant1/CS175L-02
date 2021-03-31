import java.util.Date;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;


public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		LocalDate bday = LocalDate.of(2001, 01, 18);
		String inputwindow = JOptionPane.showInputDialog("Enter your brithday (MM/DD/YYYY): ");
		
		inputwindow = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY): ");
		
		int months = Period.between(bday, today).getMonths() - (12 * Period.between(bday, today).getYears());
		
		JOptionPane.showMessageDialog(null, "You are " + Period.between(bday, today).getYears() + " years old");
		
	}

}
