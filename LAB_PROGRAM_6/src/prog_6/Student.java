package prog_6;

public class Student {

	String USN , Name;

	public String getUSN() {
		return USN;
	}

	public void setUSN(String uSN) {
		USN = uSN;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public String toString() {
		return "USN is"+USN+" Name is "+Name;
	}
	
	
	
}
