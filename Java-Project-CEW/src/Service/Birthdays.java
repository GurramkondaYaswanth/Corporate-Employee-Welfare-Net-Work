package Service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Birthdays {
	ArrayList<String> BDstr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	public void bdays(String email,String password) {
		
		System.out.println("");
		System.out.println("*****************************************************Employee Birthdays*********************************************************");
		if(BDstr.size() == 0) {
			BDstr.add("Gurramkonda Yaswanth     27/02/2000");
			BDstr.add("Bill Gates               28/10/1955");		
		}
		if(email.equalsIgnoreCase("Hr@gmail.com")) {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view the Employee Birthdays or 2 to add the Employee Birthdays or 3 to delete the Employee Birthdays or 4 to search: ");
		int BDviewPostDel = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		//adding some default Employee Birthdays
		
		
		if(BDviewPostDel == 1) { //viewing
			System.out.println("****************************************************Employee Birthdays list ****************************************************");
			BDdisplay();
			BDback(email,password);
		}else if(BDviewPostDel == 2) { //posting
			
				BDPost(email, password); 
				BDdisplay();
				BDback(email,password);
			
			
		}else if(BDviewPostDel == 3) { //delete
			 BDdisplay();
			 BDdelete(email, password);
			 BDdisplay();
			 BDback(email,password);
		}else if(BDviewPostDel == 4) { //search
			BDsearch();
			 BDback(email,password);
		}
		
		
	}else {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view view the Employee Birthdays list or 2 to search: ");
		int BDviewPostDelSearch1 = sc.nextInt();
		sc.nextLine();
		if(BDviewPostDelSearch1 == 1) {
			BDdisplay();
			BDback(email,password);
		}else if(BDviewPostDelSearch1 == 2) {
			BDsearch();
			BDback(email,password);
		}
		}
	}
	
	public void BDdisplay() {  //for displaying
		System.out.println("Employee Name              Date of birth");
		Collections.sort(BDstr);
		int j =1;
		 for (String i : BDstr) {
		      System.out.println(j+". "+i);
		      j++;
		    }
		}
	public void BDPost(String email, String password) {  //for posting
		System.out.print("Employee Name: ");
		String Name = sc.nextLine();
		System.out.print("Date of birth: ");
		String DOB = sc.nextLine();
		int spaces = 25- (Name.length());
		if(spaces<0) {
			spaces = 0;
		}
		for(int i=0; i<spaces; i++) {
			Name = Name + " "; 
		}
		String post = Name+DOB;  
		BDstr.add(post);
		System.out.println("");
		System.out.println("***************************************Employee Birthdays list after adding*****************************************");	
	}
	
	public void BDdelete(String email, String password){  //for deleting
		 System.out.print("Enter the Employee Birthday number/index from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 deleteNumber = deleteNumber-1;
		 BDstr.remove(deleteNumber);
		 System.out.println("");
		 System.out.println("***************************************Employee Birthdays after deleting ***************************************");
	}
	
	public void BDsearch() {
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		 System.out.println("*********************************************Employee Birthdays after filtering**********************************************");
		 System.out.println("");
		 System.out.println("Employee Name              Date of birth");
		int j =1;
		for (String i : BDstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	public void BDback(String email,String password) {  //for going back to the services/functionalities
		System.out.println();
		System.out.println("");
		 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for going back to Employee Birthdays or press 3 for exit: ");
		 int goback = sc.nextInt();
		 if(goback == 1) {
			 BackToCRUD BTC= new BackToCRUD();
			 BTC.BackToCRUD(email,password);
		 }else if(goback == 3){
			 System.out.println("");
			 System.out.println("***************************************************Have a great day*******************************************************");
		 }else if(goback == 2) {
			 bdays(email,password);
			 
		 }
	}

}
