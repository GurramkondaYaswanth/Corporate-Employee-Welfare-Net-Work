package Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PersonalRelatingThings {
	ArrayList<String> PRTstr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

	public void PRT(String email,String password) {
		System.out.println("");
		System.out.println("***************************************Personal relating things( Property sales and Home rent )**************************************************");
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view all the Property sales and Home rent list or 2 to post or 3 to delete or 4 to search: ");
		int PRTviewPostDel = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		//adding some default property
		if(PRTstr.size() == 0) {
			PRTstr.add("Rent                20K/month   M.R.palli,Tirupathi    03/09/20 17:00:39   Yashwanth2000@gmail.com           double bed room, near PVR Mall, 24hrs Water availability" );
			PRTstr.add("Land Sale           1 crore     Air By pass Road       03/09/20 17:07:11   Gurramkondayaswanth@gmail.com     Near More super Market");
			
		}
		
		if(PRTviewPostDel == 1) { //viewing
			System.out.println("****************************************************Property sales and Home rent list*********************************************************");
			PRTdisplay();
			PRTback(email,password);
		}else if(PRTviewPostDel == 2) { //posting
			PRTPost(email, password);  
			PRTdisplay();
			PRTback(email,password);
		}else if(PRTviewPostDel == 3) { //delete
			 PRTdisplay();
			 PRTdelete(email, password);
			 PRTback(email,password);
		}else if(PRTviewPostDel == 4) { //search
			 PRTsearch();
			 PRTback(email,password);
		}
	}
	
    public void PRTdisplay() {  //for displaying
    	System.out.println("Property type          cost        Location               PostedOn            email                             Extra details");
		int j =1;
		 for (String i : PRTstr) {
		      System.out.println(j+". "+i);
		      j++;
		    }
	}
	
	public void PRTPost(String email, String password) {  //for posting
		System.out.print("Property type (rent/sale): ");
		String type = sc.nextLine();
		System.out.print("cost: ");
		String cost = sc.nextLine();
		System.out.print("Location: ");
		String Location = sc.nextLine();
		System.out.print("Extra details: ");
		String details = sc.nextLine();
		
		int spaces = 20- (type.length());  
		int spaces1 = 12 - (cost.length());
		int spaces2 = 23- (Location.length());
		int spaces3 = 34 - (email.length());  //email length
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
			type = type + " "; 
		}
		for(int j=0; j<spaces1; j++) {
			cost = cost + " "; 
		}
		for(int k=0; k<spaces2; k++) {
			Location = Location + " "; 
		}
		for(int l=0; l<spaces3; l++) {
			email = email + " "; 
		}
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");  //current time and date
	    Date dateobj = new Date();
		String post = type+cost+Location+df.format(dateobj)+"   "+email+details;
		PRTstr.add(post);
		System.out.println("");
		System.out.println("********************************************Property sales and Home rent list after adding ***************************************************");
		
	}
	
	public void PRTdelete(String email, String password) {    //for deleting
		System.out.println("");
		 System.out.print("Enter the number of the Matrimonial from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 sc.nextLine();  //getting the password of user for checking
		 System.out.print("Enter ur password for confirmation: ");
		 String confirmPassword = sc.nextLine();
		 //checking whether the user is HR or the same user who posted
		 int delIndex = deleteNumber-1; 
		 deleteNumber = deleteNumber-1;
		 if(deleteNumber <= PRTstr.size()) {
		 String PRTdel = PRTstr.get(delIndex);
		 String delEmail = PRTdel.substring((PRTdel.indexOf("by")+3),(PRTdel.indexOf(".com")+4) );  //for getting author email
		// System.out.println("deleting post email: "+delEmail);
		 //boolean ifcond = (email.equalsIgnoreCase(delEmail) && confirmPassword.equals(password));
		 //System.out.println(ifcond);
		 if( (email.equalsIgnoreCase(delEmail) && confirmPassword.equals(password)) || confirmPassword.equals("Hr@12345")) {
			 
			 PRTstr.remove(deleteNumber);
			 System.out.println("");
			 System.out.println("*********************************************Property sales and Home rent list after deletion**********************************************");
			 PRTdisplay();
		 }else {	
			 System.out.println();
			 System.out.println("only HR or the user who posted can delete this post");
		 }
	 }else {
		  System.out.println("");
		  System.out.println("Invalid Input"); 
		  System.out.println("");
		  System.out.println("******************************************************Property sales and Home rent list*******************************************************");
		  PRTdisplay();
		 }
	}
	
	public void PRTsearch() {
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		 System.out.println("*********************************************Property sales and Home rent list after filtering**********************************************");
		 System.out.println("");
		 System.out.println("Property type          cost        Location               PostedOn            email                             Extra details");
		int j =1;
		for (String i : PRTstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	public void PRTback(String email,String password) {
		//for going back to the services/functionalities or for choosing other functions of 
				System.out.println("");
				 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for Property sales and Home rent other functions or press 3 for exit: ");
				 int goback = sc.nextInt();
				 if(goback == 1) {
					 BackToCRUD BTC= new BackToCRUD();
					 BTC.BackToCRUD(email, password);
				 }else if(goback == 3){
					 System.out.println();
					 System.out.println("***************************************************Have a great day*******************************************************");
				 }else if(goback == 2) {
					 PRT(email, password);
				 }
	}
}
	

