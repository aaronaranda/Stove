public class Burner {
	private enum Temperature {
		BLAZING, HOT, WARM, COLD		
	}
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public final static int TIME_DURATION = 2;
	
	public Temperature getMyTemperature() {
		return myTemperature;
	}

	public void Burner() {
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
	}
	
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
	
	public void minusButton() {
		switch(mySetting) {
		case HIGH:
			this.mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			this.mySetting = Setting.LOW;
			break;
		case LOW:
			this.mySetting = Setting.OFF;
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public void updateTemperature() {
		// TODO Auto-generated method stub
		
	}

}
