	
	import javax.swing.JOptionPane;
	import java.text.DecimalFormat;
	
public class RoachSimulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  DecimalFormat decFormat = new DecimalFormat("0.00");
	      DecimalFormat noDecimalsFormat = new DecimalFormat("0");
		
		
		String inputWindow = JOptionPane.showInputDialog("Enter starting roach population:");
	      double startingpop = Double.parseDouble(inputWindow);
	      
	      RoachPopulation bugs = new RoachPopulation (startingpop);
	      JOptionPane.showMessageDialog(null, "The initial roach population is: " + noDecimalsFormat.format(bugs.getRoach()));
	      bugs.breed();
	      JOptionPane.showMessageDialog(null, "The Roach population after cycle 1 breeding is: " + noDecimalsFormat.format(bugs.getRoach()));

	      inputWindow = JOptionPane.showInputDialog("Enter spray percentage for cycle 1:");
	      double sprayPct = Double.parseDouble(inputWindow);
	      bugs.spray(sprayPct);
	      JOptionPane.showMessageDialog(null, "The Roach population after cycle 1 " +sprayPct + " spraying is: " + noDecimalsFormat.format(bugs.getRoach()));

	      bugs.breed();
	      JOptionPane.showMessageDialog(null, "The Roach population after cycle 2 breeding is: " + noDecimalsFormat.format(bugs.getRoach()));

	      inputWindow = JOptionPane.showInputDialog("Enter spray percentage for cycle 2:");
	      sprayPct = Double.parseDouble(inputWindow);
	      bugs.spray(sprayPct);
	      JOptionPane.showMessageDialog(null, "The Roach population after cycle 2 " +sprayPct + " spraying is: " + noDecimalsFormat.format(bugs.getRoach()));

	      bugs.breed();
	      JOptionPane.showMessageDialog(null, "The Roach population after cycle 3 breeding is: " + noDecimalsFormat.format(bugs.getRoach()));

	      inputWindow = JOptionPane.showInputDialog("Enter spray percentage for cycle 3:");
	      sprayPct = Double.parseDouble(inputWindow);
	      bugs.spray(sprayPct);
	      JOptionPane.showMessageDialog(null, "The Roach population after cycle 3 " +sprayPct + " spraying is: " + noDecimalsFormat.format(bugs.getRoach()));

	      bugs.breed();
	      JOptionPane.showMessageDialog(null, "The Roach population after cycle 4 breeding is: " + noDecimalsFormat.format(bugs.getRoach()));

	      inputWindow = JOptionPane.showInputDialog("Enter spray percentage for cycle 4:");
	      sprayPct = Double.parseDouble(inputWindow);
	      bugs.spray(sprayPct);
	      JOptionPane.showMessageDialog(null, "The Roach population after cycle 4 " +sprayPct + " spraying is: " + noDecimalsFormat.format(bugs.getRoach()));

	}

}
