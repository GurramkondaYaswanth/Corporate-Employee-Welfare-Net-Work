package Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Matrimonial {
	ArrayList<String> Mstr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	public void matrimonial(String email, String password) {
		
		System.out.println("");
		System.out.println("*****************************************************Matrimonial*************************************************************");
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view all the Matrimonial list or 2 to post or 3 to delete or 4 to search: ");
		int MviewPostDel = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		//adding some default Matrimonial
		if(Mstr.size() == 0) {
			Mstr.add("Gurramkonda Yaswanth   Male     15LPA   25    03/09/20 13:16:27   gurramkondayaswanth@gmail.com");
			Mstr.add("Smriti Mandhana        Female   10CPA   25    03/09/20 13:16:27   SmritiMandhana@gmail.com");
			
		}
		
		if(MviewPostDel == 1) { //viewing
			System.out.println("****************************************************Matrimonial list*********************************************************");
			Mdisplay();
			Mback(email,password);
		}else if(MviewPostDel == 2) { //posting
			MPost(email, password);  
			Mdisplay();
			Mback(email,password);
		}else if(MviewPostDel == 3) { //delete
			 Mdisplay();
			 Mdelete(email, password);
			 Mback(email,password);
		}else if(MviewPostDel == 4) { //search
			 Msearch();
			 Mback(email,password);
		}else {
			 //System.out.println("");
				System.out.println("Invalid Input");
				Mback(email,password);
		}
	}
	
    public void Mdisplay() {  //for displaying
    	System.out.println("Name                      Gender   CTC     Age   PostedOn            email");
		int j =1;
		 for (String i : Mstr) {
		      System.out.println(j+". "+i);
		      j++;
		    }
	}
	
	public void MPost(String email, String password) {  //for posting
		System.out.print("Name: ");
		String Name = sc.nextLine();
		System.out.print("Gender: ");
		String Gender = sc.nextLine();
		System.out.print("CTC: ");
		String CTC = sc.nextLine();
		System.out.print("Age: ");
		String Age = sc.nextLine();
		
		int spaces = 23- (Name.length());
		int spaces1 = 9 - (Gender.length());
		int spaces2 = 8- (CTC.length());
		if(spaces<0) {
			spaces = 0;
		}
		if(spaces1<0)
			spaces1=0;
		if(spaces2<0)
			spaces2=0;
		for(int i=0; i<spaces; i++) {
			Name = Name + " "; 
		}
		for(int j=0; j<spaces1; j++) {
			Gender = Gender + " "; 
		}
		for(int k=0; k<spaces2; k++) {
			CTC = CTC + " "; 
		}
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");  //current time and date
	    Date dateobj = new Date();
		String post = Name+Gender+CTC+Age+"    "+df.format(dateobj)+"   "+email;
		Mstr.add(post);
		System.out.println("");
		System.out.println("********************************************Matrimonial list after adding ***************************************************");
		
	}
	
	public void Mdelete(String email, String password) {    //for deleting
		System.out.println("");
		 System.out.print("Enter the number of the Matrimonial from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 sc.nextLine();  //getting the password of user for checking
		 System.out.print("Enter ur password for confirmation: ");
		 String confirmPassword = sc.nextLine();
		 //checking whether the user is HR or the same user who posted
		 int delIndex = deleteNumber-1; 
		 
		 deleteNumber = deleteNumber-1;
		 if(deleteNumber <= Mstr.size()) {
		 String Mdel = Mstr.get(delIndex);
		 String delEmail = Mdel.substring((Mdel.indexOf("by")+3),(Mdel.indexOf(".com")+4) );  //for getting author email
		// System.out.println("deleting post email: "+delEmail);
		 //boolean ifcond = (email.equalsIgnoreCase(delEmail) && confirmPassword.equals(password));
		 //System.out.println(ifcond);
		 if( (email.equalsIgnoreCase(delEmail) && confirmPassword.equals(password)) || confirmPassword.equals("Hr@12345")) {
			 Mstr.remove(deleteNumber);
			 System.out.println("");
			 System.out.println("*********************************************Matrimonial list after deletion**********************************************");
			 Mdisplay();
		 }else {	
			 System.out.println();
			 System.out.println("only HR or the user who posted can delete this post");
		 }
	     }else {
		  System.out.println("");
		  System.out.println("Invalid Input"); 
		  System.out.println("");
		  System.out.println("*********************************************************Matrimonial list*****************************************************");
		  Mdisplay();
		 }
	}
	
	public void Msearch() {
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		 System.out.println("*********************************************Matrimonial list after filtering**********************************************");
		 System.out.println("");
		 System.out.println("Name                      Gender   CTC     Age   PostedOn            email");
		int j =1;
		for (String i : Mstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	
	
	public void Mback(String email,String password) {
		//for going back to the services/functionalities or for choosing other functions of Matrimonial
				System.out.println("");
				 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for Matrimonial other functions or press 3 for exit: ");
				 int goback = sc.nextInt();
				 if(goback == 1) {
					 BackToCRUD BTC= new BackToCRUD();
					 BTC.BackToCRUD(email, password);
				 }else if(goback == 3){
					 System.out.println();
					 System.out.println("***************************************************Have a great day*******************************************************");
				 }else if(goback == 2) {
					 matrimonial(email, password);
				 }else {
					 System.out.println("");
						System.out.println("Invalid Input");
						Mback(email,password);
				}
	}
}
