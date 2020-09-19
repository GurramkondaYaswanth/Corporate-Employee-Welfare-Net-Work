package businesslogic;

import java.util.Scanner;

import model.User;

public class ValidateUser {
	Scanner sc = new Scanner(System.in);
	//User user = new User();
	public boolean validate(int HrEmp,String email, String password) {
		//user.validateip();
//		System.out.println();
//		System.out.println("login Credentials");
//		System.out.print("Enter your office mail id: ");
//		String email = sc.nextLine();
//		System.out.print("Enter the Password: ");
//		String password = sc.nextLine();
		
		
//		user.setEmail(email);
//		user.setPassword(password);
//		System.out.println(user.getEmail());
		
	if(HrEmp == 1) {
		if(email.equalsIgnoreCase("hr@gmail.com") && password.equals("Hr@12345"))
			return true;
		else 
			System.out.println("Invalid credentials");
			return false;
	}else {
		if(email.equalsIgnoreCase("employee@gmail.com") && password.equals("Employee@12345"))
			return true;
		else 
			System.out.println("Invalid credentials");
			return false;
	}
	}

}
