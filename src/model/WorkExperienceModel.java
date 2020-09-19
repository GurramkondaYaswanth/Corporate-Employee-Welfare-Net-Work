package model;

public class WorkExperienceModel {
	
	private String Name;
	private String Designation;
	private String Experience;
	private String Empemail ;
	private String details;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		this.Designation = designation;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		this.Experience = experience;
	}
	public String getEmpemail() {
		return Empemail;
	}
	public void setEmpemail(String empemail) {
		this.Empemail = empemail;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public WorkExperienceModel(String name, String designation, String experience, String empemail, String details) {
		super();
		this.Name = name;
		this.Designation = designation;
		this.Experience = experience;
		this.Empemail = empemail;
		this.details = details;
	}
	
	
	

}
