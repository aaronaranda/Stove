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

	public Burner() {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public void updateTemperature() {
		if (timer != 0){
			timer = timer -1;
		}
		else {
			switch(mySetting) {
			case OFF:
				this.myTemperature = Temperature.COLD;
				break;
			case LOW:
				this.myTemperature = Temperature.WARM;
				break;
			case MEDIUM:
				this.myTemperature = Temperature.HOT;
				break;
			case HIGH:
				this.myTemperature = Temperature.BLAZING;
				break;
			}
		}
		
	}

}
