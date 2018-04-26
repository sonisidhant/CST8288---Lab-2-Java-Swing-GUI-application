package network;
/**
 * 
 * @author Sidhant Soni
 *
 */
public class ShannonsTheorem {
	/**
	 * This class mainly consist of getters and setters which calls the getters and setters of ShannonsModel class and set the value of bandwidth
	 * and SignalToNoiseRatio.Further, it calls maximum data rate method of ShannonsModel Class which calculates the value of MDR and take the 
	 * value of it. 	 
	 */
	 private ShannonsModel model;
	
	/**
	 * Default Constructor
	 */
	public ShannonsTheorem(){
		model = new ShannonsModel(); 
	}
	
	/**
	 * 
	 * @return value of bandwidth
	 */
	
	public double getBandwidth() {
		return model.getBandwidth();
	}
	
	
	
	/**
	 * 
	 * @return getMaximumDataRate method
	 */
	public double getMaximumDataRate(){
		return model.getMaximumDataRate();
	}
	
	/**
	 * 
	 * @return value of Signal To Noise 
	 */
	public double getSignalToNoise() {
		return model.getSignalToNoise();
	}
	
	/**
	 * 
	 * @param h assigns the value of bandwidth
	 */
	public void setBandwidth(double h) {
		model.setBandwidth(h);
	}
	
	/**
	 * 
	 * @param snr assigns the value of signal to noise
	 */
	public void setSignalToNoise(double snr) {
		model.setSignalToNoise(snr);
	}
	
	/**
	 * it returns the final message to display Maximum Data Rate
	 */
	public String toString(){
		return "The value of Maximum Data Rate is: ";
		}
 
}

