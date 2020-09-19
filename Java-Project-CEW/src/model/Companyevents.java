package model;

public class Companyevents {
	private String Event;
	private String Eventlink;
	public String getEvent() {
		return Event;
	}
	public void setEvent(String event) {
		this.Event = event;
	}
	public String getEventlink() {
		return Eventlink;
	}
	public void setEventlink(String eventlink) {
		this.Eventlink = eventlink;
	}
	public Companyevents(String event, String eventlink) {
		super();
		this.Event = event;
		this.Eventlink = eventlink;
	}
}
