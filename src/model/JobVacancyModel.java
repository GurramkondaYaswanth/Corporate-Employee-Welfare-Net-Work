package model;

public class JobVacancyModel {
	private String Name;
	private String CTC;
	private String minQual;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getCTC() {
		return CTC;
	}
	public void setCTC(String cTC) {
	    this.CTC= cTC;
	}
	public String getMinQual() {
		return minQual;
	}
	public void setMinQual(String minQual) {
		this.minQual = minQual;
	}
	public JobVacancyModel(String name, String cTC, String minQual) {
		super();
		this.Name = name;
		this.CTC = cTC;
		this.minQual = minQual;
	}
}
