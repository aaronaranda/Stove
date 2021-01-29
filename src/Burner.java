//Authors: Aaron Aranda and Lauren Loe
public class Burner {
	private enum Temperature {
		BLAZING, HOT, WARM, COLD		
	}
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public final static int TIME_DURATION = 2;
	
	
	//Return the current temperature of a particular burner. 
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
		boolean up = false;
		boolean down = false;
		boolean atTemp = false;
		timer = timer -1;
		if (timer != 0){
			return;
		}
		else {
			
			//logic for determining if the stove temperature should go up, down, or remain the same.
			switch(mySetting) {
			case OFF:
				switch(myTemperature) {
				case COLD:
					atTemp = true;
					break;
				case WARM:
					down = true;
					break;
				case HOT:
					down = true;
					break;
				case BLAZING:
					down = true;
					break;
				}
				break;
			case LOW:
				switch(myTemperature) {
				case COLD:
					up = true;
					break;
				case WARM:
					atTemp = true;
					break;
				case HOT:
					down = true;
					break;
				case BLAZING:
					down = true;
					break;
				}
				break;
			case MEDIUM:
				switch(myTemperature) {
				case COLD:
					up = true;
					break;
				case WARM:
					up = true;
					break;
				case HOT:
					atTemp = true;
					break;
				case BLAZING:
					down = true;
					break;
				}
				break;
			case HIGH:
				switch(myTemperature) {
				case COLD:
					up = true;
					break;
				case WARM:
					up = true;
					break;
				case HOT:
					up = true;
					break;
				case BLAZING:
					atTemp = true;
					break;
				}
				break;
			
			}
			
			//updates temperature
			if(up) {
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
				break;
			}
			}
			else if (down) {
				switch(myTemperature) {
				case COLD:
					break;
				case WARM:
					this.myTemperature = Temperature.COLD;
					break;
				case HOT:
					this.myTemperature = Temperature.WARM;
					break;
				case BLAZING:
					this.myTemperature = Temperature.HOT;
					break;
			}
		
			}
			if(!atTemp) {
				timer = TIME_DURATION;
			}
		}
	}
	
	
	//Display the state of the burner. 
	public String display() {
		String status = "";
		switch(myTemperature) {
		
		case COLD:
			status = ".....cooool";
			break;
		case WARM:
			status = ".....warm";
			break;
		case HOT:
			status = ".....CAREFUL";
			break;
		case BLAZING:
			status = ".....VERY HOT! DON'T TOUCH!";
			break;
		default:
			break;
		
		}
		return "[" + mySetting + "]" + status;
	}
	

	
	

}
