package model;

public class CompanyGrowthModel {
	
	private String tiltle;
	private String Growthlink;
	public String getTiltle() {
		return tiltle;
	}
	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}
	public String getGrowthlink() {
		return Growthlink;
	}
	public void setGrowthlink(String growthlink) {
		this.Growthlink = growthlink;
	}
	public CompanyGrowthModel(String tiltle, String growthlink) {
		super();
		this.tiltle = tiltle;
		this.Growthlink = growthlink;
	}
}
