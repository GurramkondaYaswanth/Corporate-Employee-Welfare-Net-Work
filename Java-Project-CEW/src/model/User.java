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
	
//	public void validateip() {
//		System.out.println();
//		System.out.println("login Credentials");
//		System.out.print("Enter your office mail id: ");
//		String email = sc.nextLine();
//		System.out.print("Enter the Password: ");
//		String password = sc.nextLine();
//		setEmail(email);
//		setPassword(password);
//	}
//	public User(String email, String password) {
//		super();
//		this.email = email;
//		this.password = password;
//	}
	
}
