
public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String setting;
	
	Setting (String setting) {
		this.setting = setting;
	}
	
	public String toString() {
		if (setting == "---") {
			return "[" + setting + "]" + ".....cooool";
		}
		else if (setting == "--+") {
			return "[" + setting + "]" + ".....warm";
		}
		else if (setting == "-++") {
			return "[" + setting + "]" + ".....CAREFUL";
		}
		else if (setting == "+++") {
			return "[" + setting + "]" + ".....VERY HOT! DON'T TOUCH!";
		}
		else {
			return "";
		}
		
	}
}
