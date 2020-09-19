package model;

public class MatrimonalModel {
	String Name;
	String Gender;
	String CTC;
	String Age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public String getCTC() {
		return CTC;
	}
	public void setCTC(String cTC) {
		this.CTC = cTC;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		this.Age = age;
	}
	public MatrimonalModel(String name, String gender, String cTC, String age) {
		super();
		this.Name = name;
		this.Gender = gender;
		this.CTC = cTC;
		this.Age = age;
	}
	
	

}
