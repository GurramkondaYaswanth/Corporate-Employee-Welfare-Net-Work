package model;

public class PersonalRelatingThingsModel {
	String type;
	String cost;
	String Location;
	String details;
	public PersonalRelatingThingsModel(String type, String cost, String location, String details) {
		super();
		this.type = type;
		this.cost = cost;
		this.Location = location;
		this.details = details;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		this.Location = location;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
