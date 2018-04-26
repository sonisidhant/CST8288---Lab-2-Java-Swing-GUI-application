package network;

/**
 * @author Sidhant Soni
 * 
 */
import javax.swing.JOptionPane;

public class ShannonInterface {
	/**
	 * This class gets the input from user of bandwidth and signal to noise ratio via JOptionOane and checks basic errors whether the user has 
	 * input a number only. 
	 */
	
	public void run(){
		/**
		 * message is a string variable to hold the value of error message.
		 * input is a string variable to hold the value of user input via JOption pane
		 * bandwidth is a double to hold the value of bandwidth
		 * signalToNoise is a double to hold the value of signalToNoise
		 */
		String message = ""; 
        String input = "";
		double bandwidth;
		double signalToNoise;

		ShannonsTheorem sh = new ShannonsTheorem ();

		
		while (true) {
			message = message + " " + " Enter the Input bandwidth";
			input = JOptionPane.showInputDialog(message);// the dialog box get the value
			try {
				bandwidth = Double.parseDouble(input);
                sh.setBandwidth(bandwidth);
				break;
			} catch (NumberFormatException e) {
				message = "Please enter a number.";// the checking the bandwidth whether, Is it a number or not.
			} catch (IllegalArgumentException e) {
				message = e.getMessage()+ ", ";
			}
		} 
		
		message ="";
		while (true) {
			message = message + " " + "Enter  the signalToNoise";
			input = JOptionPane.showInputDialog(message);
 			try {
				signalToNoise = Double.parseDouble(input);
				sh.setSignalToNoise(signalToNoise);
				break;
			} catch (NumberFormatException e) {
				message = "Please enter a number.";
			} catch (IllegalArgumentException e) {
				message = e.getMessage()+ ", ";
			}
			
		}
		JOptionPane.showMessageDialog(null, sh.toString()+ " " + sh.getMaximumDataRate());// dialog box for result

	}
	

	public static void main(String[] args) {
		ShannonInterface si = new ShannonInterface();
        si.run();
		
	}
}