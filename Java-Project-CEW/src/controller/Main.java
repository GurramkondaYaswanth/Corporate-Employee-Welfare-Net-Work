package controller;


import java.util.Scanner;

import Service.CRUDoperations;
import businesslogic.RegistrationValidation;
import businesslogic.ValidateUser;
import model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("                                         Welcome to Corporate Employee Welfare Net Work Services     ");
		System.out.println();
		
		//taking input to know if the user is hr or employee
		System.out.print("If your HR enter 1, Employee enter 2 : ");
		int HrEmployee = sc.nextInt();  
		
		//taking input to know new user or existing user
		System.out.print("Enter 1 if your existing User or else enter 2 if your new User: ");
		int newOld = sc.nextInt();
		sc.nextLine();
		
		//creating and validating the sign up credentials
		boolean signup = true;
		boolean signin = true;
		String email;
		String password;
		if(newOld == 2) {  
			System.out.println();
			System.out.println("Create Account");
			System.out.print("Enter your office mail id: ");
			 email = sc.nextLine();
			System.out.print("Enter the Password: ");
		    password = sc.nextLine();
		RegistrationValidation RV = new RegistrationValidation();
	    signup = RV.checkUserDetails(email,password);
		}else { //existing user 
			ValidateUser VU = new ValidateUser(); //validating the sign in credentials
			System.out.println();
			System.out.println("login Credentials");
			System.out.print("Enter your office mail id: ");
			email = sc.nextLine();
			System.out.print("Enter the Password: ");
			password = sc.nextLine();
			User user = new User();
			user.setEmail(email);
			user.setPassword(password);
			signin = VU.validate(HrEmployee,email,password);
		}
		
		if(signup && signin) {
			System.out.println();
			System.out.println("*******************************************Corporate Employee Welfare Net Work Services********************************************");
			System.out.println();
			System.out.println("1. Innovative thoughts");
			System.out.println("2. All Company Events(photos share)");
			System.out.println("3. Technical doughts");
			System.out.println("4. Work experience");
			System.out.println("5. Personal relating things( Property sales and Home rent )");
			System.out.println("6. All company growth(share market)");
			System.out.println("7. Job vacancy");
			System.out.println("8. Matrimonial");
			System.out.println("9. Birth days");
			System.out.println("10.Travel / Picnic / Get together Plans");
			System.out.print("Enter one number from above to view or add details: ");
			int FunctionalityNumber = sc.nextInt(); 
			
			CRUDoperations CO = new CRUDoperations();
			CO.functionality(FunctionalityNumber,email , password);
		}
	}
}

