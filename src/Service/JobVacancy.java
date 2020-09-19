package Service;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

public class JobVacancy {
	ArrayList<String> JVstr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	public void JV(String email,String password) {
		System.out.println("");
		System.out.println("*****************************************************Job Vacancies*********************************************************");
		if(JVstr.size() == 0) {//adding some default Job Vacancies
			JVstr.add("Web Developer          12LPA    BTech");
			JVstr.add("Front End Developer    8LPA     BTech");	
			JVstr.add("Data Analyst           10LPA    BTech+MBA");
		}
		if(email.equalsIgnoreCase("Hr@gmail.com")) {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view the Job Vacancies or 2 to add the Job Vacancies or 3 to delete or 4 to search: ");
		int JVviewPostDel = sc.nextInt();
		sc.nextLine();
		System.out.println("");

		if(JVviewPostDel == 1) { //viewing
			System.out.println("****************************************************Job Vacancies list ****************************************************");
			JVdisplay();
			JVback(email,password);
		}else if(JVviewPostDel == 2) { //posting
			
				JVPost(email, password); 
				JVdisplay();
				JVback(email,password);
		}else if(JVviewPostDel == 3) { //delete
			 JVdisplay();
			 JVdelete(email, password);
			 JVdisplay();
			 JVback(email,password);
		}else if(JVviewPostDel == 4) { //search
			 JVsearch();
			 JVback(email,password);
		}else {
			System.out.println("Invalid Input");
			JVback(email,password);
		}
		
		
	}else {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view view the Job Vacancies list or 2 to search: ");
		int JVviewPostDelSearch1 = sc.nextInt();
		sc.nextLine();
		if(JVviewPostDelSearch1 == 1) {
			JVdisplay();
			JVback(email,password);
		}else if(JVviewPostDelSearch1 == 2) {
			JVsearch();
			JVback(email,password);
		}else {
			System.out.println("Invalid Input");
			JVback(email,password);
		}
		
		}
	}
	
	public void JVdisplay() {  //for displaying
		System.out.println("Job Profile               CTC     Min Qualification");
		int j =1;
		 for (String i : JVstr) {
		      System.out.println(j+". "+i);
		      j++;
		    }
		}
	
	public void JVPost(String email, String password) {  //for posting
		System.out.print("Job Profile: ");
		String Name = sc.nextLine();
		System.out.print("CTC: ");
		String CTC = sc.nextLine();
		System.out.print("Min Qualification: ");
		String minQual = sc.nextLine();
		int spaces = 23- (Name.length());
		if(spaces<0) {
			spaces = 0;
		}
		for(int i=0; i<spaces; i++) {
			Name = Name + " "; 
		}
		int spaces1 = 9- (CTC.length());
		if(spaces1<0) {
			spaces1 = 0;
		}
		for(int i=0; i<spaces1; i++) {
			CTC = CTC + " "; 
		}
		String post = Name+CTC+minQual; 
		JVstr.add(post);
		System.out.println("");
		System.out.println("************************************************Job Vacancies list after adding**********************************************");	
	}
	
	public void JVdelete(String email, String password){   //for deleting
		 System.out.print("Enter the Job Vacancy number from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 deleteNumber = deleteNumber-1;
		 if(deleteNumber <= JVstr.size()) {
		 JVstr.remove(deleteNumber);
		 System.out.println("");
		 System.out.println("*********************************************Job Vacancies list after deleting **********************************************");
	}else {
		  System.out.println("");
		  System.out.println("Invalid Input"); 
		  System.out.println("");
		  System.out.println("**************************************************Job Vacancies list*********************************************************");
		 }
	}
	
	public void JVsearch() {
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		 System.out.println("*********************************************Job Vacancies list after filtering**********************************************");
		 System.out.println("");
		 System.out.println("Job Profile               CTC     Min Qualification");
		int j =1;
		for (String i : JVstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	public void JVback(String email,String password) {    //for going back to the services/functionalities
		//System.out.println();
		System.out.println("");
		 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for going back to Job vacancy or press 3 for exit: ");
		 int goback = sc.nextInt();
		 if(goback == 1) {
			 BackToCRUD BTC= new BackToCRUD();
			 BTC.BackToCRUD(email,password);
		 }else if(goback == 3){
			 System.out.println("");
			 System.out.println("***************************************************Have a great day*******************************************************");
		 }else if(goback == 2) {
			 JV(email,password);
			 
		 }else {
			 System.out.println("");
				System.out.println("Invalid Input");
				JVback(email,password);
			}
	}
	
}
