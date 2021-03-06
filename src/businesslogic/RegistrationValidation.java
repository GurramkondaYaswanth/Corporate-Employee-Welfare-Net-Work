package businesslogic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.User;

public class RegistrationValidation{
	//User user = new User();
	Scanner sc = new Scanner(System.in);
	public boolean checkUserDetails(String email, String password) {
		
//		System.out.println();
//		System.out.println("Create Account");
//		System.out.print("Enter your office mail id: ");
//		String email = sc.nextLine();
//		System.out.print("Enter the Password: ");
//		String password = sc.nextLine();
		System.out.print("Re-enter the Password: ");
		String confirmPassword =  sc.nextLine();
		if(validEmail(email) && validPassword(password,confirmPassword)) {
			System.out.println("Account has been created Sucessfully");
			//User user = new User(email, password);
			//user.setEmail(email);
			//user.setPassword(password);
			return true;
		}else {
			System.out.println("Invalid credentials");
			if(validEmail(email)) {
				System.out.println("check password, it should be atleast 8 charcters and atmost 20 and also atleast one uppercase letter, 1 lowercase letter and 1 number and special char");
			}
			else if(validPassword(password,confirmPassword)) {
				System.out.println("check the company email");
			}else {
				System.out.println("check the company email and check password, it should be atleast 8 charcters and atmost 20 and also atleast one uppercase letter, 1 lowercase letter and 1 number");
			}
		}
		return false;
	}
	

	
	private boolean validPassword(String password, String confirmPassword) {
		
		if(!password.equals(confirmPassword)) {
			return false; 
		}
		
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$"; 

		// Compile the ReGex 
		Pattern p = Pattern.compile(regex); 
		
		// Pattern class contains matcher() method to find matching between given password and regular expression. 
		Matcher m = p.matcher(password); 

		// Return if the password 
		// matched the ReGex 
		return m.matches(); 
	}
	
	private boolean validEmail(String email) {
		String regex1 = "^[A-Za-z0-9+_.-]+@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex1);
		 Matcher matcher = pattern.matcher(email);
		 
		 return matcher.matches();
	}
	

	
}