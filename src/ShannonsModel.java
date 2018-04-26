package network;

    public class ShannonsModel {
	
	/**
	 * This class mainly consist of getters and setters which gets and sets the value of bandwidth, signal to noise ratio and perform the basic
	 * calculations of calculating maximum data rate.
	 */
	
	
	/**
	 * bandwidth is a double to hold the value of bandwidth
	 * signalToNoise is a double to hold the value of signal to noise ratio
	 */
     private double bandwidth;
     private double signalToNoise;
	
	
	/**
	 * 
	 * @return value of bandwidth
	 */
     public double getBandwidth() {
        return bandwidth;
     }
	
	/**
	 * 
	 * @param hertz 
	 * @param signalToNoise
	 * @return value of Maximum Data Rate
	 */
	    private double getMaximumDataRate(double hertz, double signalToNoise){
		double MDR = hertz * (Math.log( (Math.pow( 10, (signalToNoise / 10)) + 1)) / Math.log( 2));
		return Math.round(MDR * 100d) / 100d;
	}
	
	/**
	 * 
	 * @return getMaximumDataRate method
	 */
	public double getMaximumDataRate(){
		return getMaximumDataRate(bandwidth, signalToNoise);
	}
	
	/**
	 * 
	 * @return value of Signal To Noise 
	 */
	public double getSignalToNoise() {
		return signalToNoise;
	}
	
	/**
	 * 
	 * @param h assigns the value of bandwidth
	 */
	public void setBandwidth(double h) {
		if( h < 0){
			throw new IllegalArgumentException("The number should be greater than or equal to zero:-> TRY AGAIN");
		}
		this.bandwidth = h;
	}
	
	/**
	 * 
	 * @param snr assigns the value of signal to noise
	 */
	public void setSignalToNoise(double snr) {
		if( snr < 0 ){
			throw new IllegalArgumentException("The number should be greater than or equal to zero:-> TRY AGAIN");
			}
		this.signalToNoise = snr;
	}
	/**
	 * it returns the final message to display Maximum Data Rate
	 */
	public String toString(){
		return "The value of Maximum Data Rate is: ";
		}
	
}
