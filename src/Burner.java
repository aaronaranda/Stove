public class Burner {
	private enum Temperature {
		BLAZING, HOT, WARM, COLD		
	}
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public final static int TIME_DURATION = 2;
	private boolean redlight = false;
	
	public String getMyTemperature() {
		switch(myTemperature) {
		case COLD:
			return "COLD";
		case WARM:
			return "WARM";
		case HOT:
			return "HOT";
		case BLAZING:
			return "BLAZING";					
		default:
			return " ";
		}
	}

	public Burner() {
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
	}
	
	
	//Increase the burner setting
	public void plusButton() {
		switch(mySetting) {
		case OFF:
			this.mySetting = Setting.LOW;
			timer = TIME_DURATION;
			break;
		case LOW:
			this.mySetting = Setting.MEDIUM; 
			timer = TIME_DURATION;
			break;
		case MEDIUM:
			this.mySetting = Setting.HIGH; 
			timer = TIME_DURATION;
			break;
		case HIGH: 
			timer = TIME_DURATION;
			break;
		}
	}
	
	//Decrease the burner setting
	public void minusButton() {
		switch(mySetting) {
		case HIGH:
			this.mySetting = Setting.MEDIUM;
			timer = TIME_DURATION;
			break;
		case MEDIUM:
			this.mySetting = Setting.LOW;
			timer = TIME_DURATION;
			break;
		case LOW:
			this.mySetting = Setting.OFF;
			timer = TIME_DURATION;
			break;
		case OFF:
			timer = TIME_DURATION;
			break;
		}
	}
	
	//Update the temperature based on the timer. 
	public void updateTemperature() {
		if (timer != 0){
			timer = timer -1;
		}
		else {
			if(mySetting == Setting.OFF && myTemperature == Temperature.WARM)
			if() {
			switch(myTemperature) {
			case COLD:
				this.myTemperature = Temperature.WARM;
				break;
			case WARM:
				this.myTemperature = Temperature.HOT;
				break;
			case HOT:
				this.myTemperature = Temperature.BLAZING;
				break;
			case BLAZING:
				this.redlight = true;
				break;
			}
			}
		}
		
	}
	
	//Display the state of the burner. 
	public String display() {
		return this.mySetting.toString();
	}
	
	public boolean redLightOn() {
		return this.redlight;
	}
	
	

}
