package model;

public class VacationPlansGetTogetherModel {
	private String EventName;
	private String Location ;
	private String Date;
	private String Link;
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		this.EventName = eventName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		this.Location = location;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		this.Date = date;
	}
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		this.Link = link;
	}
	public VacationPlansGetTogetherModel(String eventName, String location, String date, String link) {
		super();
		this.EventName = eventName;
		this.Location = location;
		this.Date = date;
		this.Link = link;
	}
	
	

}
