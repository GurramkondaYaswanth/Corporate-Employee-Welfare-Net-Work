package model;

import java.util.Scanner;

public class User {
	String email;
	String password;
	Scanner sc = new Scanner(System.in);
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String email, String password, Scanner sc) {
		super();
		this.email = email;
		this.password = password;
		this.sc = sc;
	}
	

	
}
