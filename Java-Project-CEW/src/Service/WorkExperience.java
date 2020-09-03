package Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class WorkExperience {
	ArrayList<String> WEstr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	public void WE(String email,String password) {
		System.out.println("");
		System.out.println("******************************************************Work Experience********************************************************");
		if(WEstr.size() == 0) {  //adding some default experience of employee
			WEstr.add("Gurramkonda Yaswanth  Full stack developer   Fresher       03/09/20 17:00:39   Gurramkondayaswanth@gmail.com     Java,JavaScript,HTML,CSS,DSA" );
			WEstr.add("Bill Gates            Chair Person           45 years      03/09/20 17:05:39   Billgates@gmail.com               Big Picture, Focus,Passionate,Leadership...");
			
		}
		if(email.equalsIgnoreCase("Hr@gmail.com")) {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view all the company employee work experiences or 2 to add an employee work experience or 3 to delete or 4 to search: ");
		int WEviewPostDelSearch = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		
		
		
		if(WEviewPostDelSearch == 1) { //viewing
			System.out.println("*********************************************Work Experience of Employees***********************************************");
			WEdisplay();
			WEback(email,password);
		}else if(WEviewPostDelSearch == 2) { //posting
			
				WEPost(email, password); 
				WEdisplay();
				WEback(email,password);
			
			
		}else if(WEviewPostDelSearch == 3) { //delete
			 WEdisplay();
			 WEdelete(email, password);
			 WEdisplay();
			 WEback(email,password);
		}else if(WEviewPostDelSearch == 4) {
			WEsearch();
			WEback(email,password);
		}
		
		
	}else {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view all the company employee work experiences or 2 to search: ");
		int WEviewPostDelSearch1 = sc.nextInt();
		sc.nextLine();
		if(WEviewPostDelSearch1 == 1) {
			WEdisplay();
			WEback(email,password);
		}else if(WEviewPostDelSearch1 == 2) {
			WEsearch();
			WEback(email,password);
		}
			
		}
	}
	public void WEdisplay() {  //for displaying
		System.out.println("");
    	System.out.println("Name                     Designation            Experience    PostedOn            email                             Extra details(Skills)");
		int j =1;
		 for (String i : WEstr) {
		      System.out.println(j+". "+i);
		      j++;
		    }
	}
	
	public void WEPost(String email, String password) {  //for posting
		System.out.print("Employee Name: ");
		String Name = sc.nextLine();
		System.out.print("Designation: ");
		String Designation = sc.nextLine();
		System.out.print("Experience: ");
		String Experience = sc.nextLine();
		System.out.print("Employee email: ");
		String Empemail = sc.nextLine();
		System.out.print("Extra details/Skills: ");
		String details = sc.nextLine();
		
		int spaces = 22- (Name.length());  
		int spaces1 = 23 - (Designation.length());
		int spaces2 = 14- (Experience.length());
		int spaces3 = 34 - (Empemail.length());  //email length
		if(spaces<0) {
			spaces = 0;
		}
		if(spaces1<0)
			spaces1=0;
		if(spaces2<0)
			spaces2=0;
		if(spaces3<0)
			spaces3=0;
		for(int i=0; i<spaces; i++) {
			Name = Name + " "; 
		}
		for(int j=0; j<spaces1; j++) {
			Designation = Designation + " "; 
		}
		for(int k=0; k<spaces2; k++) {
			Experience = Experience + " "; 
		}
		for(int l=0; l<spaces3; l++) {
			Empemail = Empemail + " "; 
		}
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");  //current time and date
	    Date dateobj = new Date();
		String post = Name+Designation+Experience+df.format(dateobj)+"   "+Empemail+details;
		WEstr.add(post);
		System.out.println("");
		System.out.println("********************************************Work Experience of Employees after adding ***************************************************");
		
	}
	
	public void WEdelete(String email, String password){   //for deleting
		 System.out.print("Enter the Work Experience of Employee number from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 deleteNumber = deleteNumber-1;
		 WEstr.remove(deleteNumber);
		 System.out.println("");
		 System.out.println("*********************************************Work Experience of Employees after deleting **********************************************");
	}
	
	public void WEsearch() {
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		 System.out.println("*********************************************Work Experience of Employees after filtering**********************************************");
		 System.out.println("");
	    	System.out.println("Name                     Designation            Experience    PostedOn            email                             Extra details(Skills)");
		int j =1;
		for (String i : WEstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	public void WEback(String email,String password) {
		//for going back to the services/functionalities or for choosing other functions of Work Experience of Employee
				System.out.println("");
				 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for Work Experience of Employee other functions or press 3 for exit: ");
				 int goback = sc.nextInt();
				 if(goback == 1) {
					 BackToCRUD BTC= new BackToCRUD();
					 BTC.BackToCRUD(email, password);
				 }else if(goback == 3){
					 System.out.println();
					 System.out.println("***************************************************Have a great day*******************************************************");
				 }else if(goback == 2) {
					 WE(email, password);
				 }
	}
}
