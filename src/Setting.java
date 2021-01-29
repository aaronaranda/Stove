//Authors: Aaron Aranda and Lauren Loe

//emumerations for stove setting
public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String setting;
	
	//constructor
	Setting (String setting) {
		this.setting = setting;
	}
	
	//toString function for the enum.
	public String toString() {
		return setting;

	}
	
	
}
