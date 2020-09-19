package model;

public class BirthdayModel {
	private String Name;
	private String DOB;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public BirthdayModel(String name, String dOB) {
		super();
		Name = name;
		DOB = dOB;
	}
	
}
