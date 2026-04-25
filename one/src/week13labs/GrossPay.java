package week13labs;
import javax.swing.JOptionPane;
public class GrossPay {

	public static void main(String[] args) 
	{
		
		JOptionPane.showMessageDialog(null, "I am going to ask your name");
		
		String name = JOptionPane.showInputDialog("Enter your name: ");
		
		String hoursST = JOptionPane.showInputDialog("Enter number of hours you worked: ");
		
		double hoursDouble = Double.parseDouble(hoursST);
		
		String payrate = JOptionPane.showInputDialog("Enter your hourly payrate: ");
		double prInt = Double.parseDouble(payrate);
		
		double grosspay = hoursDouble * prInt;
		
		JOptionPane.showMessageDialog(null, "Your name is: " + name + "\nYour grosspay $: " + grosspay + "\nThank you for using this program.");

		
		
		
		
		
		
		
	}
}
