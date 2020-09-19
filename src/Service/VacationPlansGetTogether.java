package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VacationPlansGetTogether {
	ArrayList<String> VPGTstr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	public void VPGT(String email,String password) {
		
		System.out.println("");//adding some default plans
		System.out.println("*****************************************************Travel / Picnic / Get together Plans*********************************************************");
		if(VPGTstr.size() == 0) {
			VPGTstr.add("Travel Tour       GOA               15/09/2020 to 18/09/2020     https://docs.google.com/forms/d/e/1FAIpQLScxNt3Z-NSjelMv9MQhPA9Lrco4wobV24n9ZzEG0ex7WV3l6A/viewform?usp=sf_link");
			VPGTstr.add("Get together      Taj Hotel         2/10/2020 18:30 to 22:00     https://docs.google.com/forms/d/e/1FAIpQLScxNt3Z-NSjelMv9MQhPA9Lrco4wobV24n9ZzEG0ex7WV3l6A/viewform?usp=sf_link");		
		}
		if(email.equalsIgnoreCase("Hr@gmail.com")) {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view the Travel/Picnic/Get together Plans or 2 to add the plans or 3 to delete or 4 to search: ");
		int VPGTviewPostDel = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		
		if(VPGTviewPostDel == 1) { //viewing
			System.out.println("****************************************************Travel / Picnic / Get together Plans list ****************************************************");
			VPGTdisplay();
			VPGTback(email,password);
		}else if(VPGTviewPostDel == 2) { //posting
			
			VPGTPost(email, password); 
			VPGTdisplay();
			VPGTback(email,password);
			
			
		}else if(VPGTviewPostDel == 3) { //delete
			VPGTdisplay();
			VPGTdelete(email, password);
			VPGTdisplay();
			VPGTback(email,password);
		}else if(VPGTviewPostDel == 4) { //delete
			VPGTsearch();
			VPGTback(email,password);
		}else {
			 //System.out.println("");
				System.out.println("Invalid Input");
				VPGTback(email,password);
		}
		
		
	}else {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view view the Travel / Picnic / Get together Plans list or 2 to search: ");
		int VPGTviewPostDelSearch1 = sc.nextInt();
		sc.nextLine();
		if(VPGTviewPostDelSearch1 == 1) {
			VPGTdisplay();
			VPGTback(email,password);
		}else if(VPGTviewPostDelSearch1 == 2) {
			VPGTsearch();
			VPGTback(email,password);
		}else {
			 //System.out.println("");
				System.out.println("Invalid Input");
				VPGTback(email,password);
		}
		}
	}
	
	public void VPGTdisplay() {  //for displaying
		System.out.println("Event                Location          Date & Time                  Reg Link");
		Collections.sort(VPGTstr);
		int j =1;
		 for (String i : VPGTstr) {
		      System.out.println(j+". "+i);
		      j++;
		    }
		}
	
	public void VPGTPost(String email, String password) {  //for posting
		System.out.print("Event: ");
		String EventName = sc.nextLine();
		System.out.print("Location: ");
		String Location = sc.nextLine();
		System.out.print("Date & Time: ");
		String Date = sc.nextLine();
		System.out.print("Reg Link: ");
		String Link = sc.nextLine();
		
		int spaces = 18- (EventName.length());
		int spaces1 = 18 - (Location.length());
		int spaces2 = 29- (Date.length());
		if(spaces<0) {
			spaces = 0;
		}
		if(spaces1<0)
			spaces1=0;
		if(spaces2<0)
			spaces2=0;
		for(int i=0; i<spaces; i++) {
			EventName = EventName + " "; 
		}
		for(int j=0; j<spaces1; j++) {
			Location = Location + " "; 
		}
		for(int k=0; k<spaces2; k++) {
			Date = Date + " "; 
		}
		String post = EventName+Location+Date+Link;  
		VPGTstr.add(post);
		System.out.println("");
		System.out.println("***************************************Travel/Get together Plans after adding*****************************************");	
		System.out.println("");
	}
	
	public void VPGTdelete(String email, String password){  //for deleting
		 System.out.print("Enter the Travel/Get together Plans number/index from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 deleteNumber = deleteNumber-1;
		 if(deleteNumber <= VPGTstr.size()) {
		 VPGTstr.remove(deleteNumber);
		 System.out.println("");
		 System.out.println("*******************************************Travel/Get together Plans after deleting *****************************************");
		}else {
		 System.out.println("");
		 System.out.println("Invalid Input"); 
		 System.out.println("");
		 System.out.println("***********************************************Travel/Get together Plans*****************************************************");
		}
		 
	}
	
	public void VPGTsearch() {
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		System.out.println("******************************************Travel/Get together Plans after filtering********************************************");
		 System.out.println("");
		System.out.println("Event                Location          Date & Time                  Reg Link");
		int j =1;
		for (String i : VPGTstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	public void VPGTback(String email,String password) {  //for going back to the services/functionalities
		//System.out.println();
		System.out.println("");
		 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for going back to Travel/Get together Plans or press 3 for exit: ");
		 int goback = sc.nextInt();
		 if(goback == 1) {
			 BackToCRUD BTC= new BackToCRUD();
			 BTC.BackToCRUD(email,password);
		 }else if(goback == 3){
			 System.out.println("");
			 System.out.println("***************************************************Have a great day*******************************************************");
		 }else if(goback == 2) {
			 VPGT(email,password);
			 
		 }else {
			 System.out.println("");
			 System.out.println("Invalid Input");
			 VPGTback(email,password);
		}
	}

}
