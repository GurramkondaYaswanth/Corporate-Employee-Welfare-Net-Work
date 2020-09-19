package Service;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

import model.User;

public class TechnicalDoubts {
	ArrayList<String> TDstr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	//User user = new User();
	
	public void TD(String email, String password) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("*****************************************************Technical Doubts********************************************************");
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view all the Technical Doubts or 2 to post your doubts or 3 to delete the previous posts or 4 to answer ur colleague doubts or 5 to search: ");
		int TDviewPostDelAns = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		//adding some default Technical Doubts
		if(TDstr.size() == 0) {
			TDstr.add("What is a SAN, and how is it used? by gurramkondayaswanth@gmail.com");
			TDstr.add("When is it appropriate to denormalize database design? by gurramkondayaswanth@gmail.com");
			TDstr.add("Why Java is not 100% Object-oriented? by gurramkondayaswanth@gmail.com");
			
		}
		
		if(TDviewPostDelAns == 1) { //viewing
			System.out.println("**************************************************Technical Doubts list******************************************************");
			TDdisplay();
			TDback(email,password);
		}else if(TDviewPostDelAns == 2) { //posting
			TDPost(email, password);     
			TDback(email,password);
		}else if(TDviewPostDelAns == 3) { //delete
			 TDdisplay();
			 TDdelete(email, password);
			 TDback(email,password);
		}else if(TDviewPostDelAns == 4) {  //answer
			TDdisplay();
			TDAns(email,password);
			TDdisplay();
			TDback(email,password);
		}else if(TDviewPostDelAns == 5) {  //search
			TDsearch();
			TDback(email,password);
		}

	}
	
	public void TDdisplay() {  //for displaying
		
		int j =1;
		 for (String i : TDstr) {
		      System.out.println(j+". "+i);
		      j++;
		    }
	}
	
	public void TDPost(String email, String password) {  //for posting
		System.out.print("Your Technical Doubt: ");
		String newDoubt = sc.nextLine();
		newDoubt = newDoubt+ " by "+email;
		TDstr.add(newDoubt);
		System.out.println("");
		System.out.println("******************************************Technical Doubts list after adding ur doubt********************************************");
		TDdisplay();
	}
	
	public void TDdelete(String email, String password) {    //for deleting
		System.out.println("");
		 System.out.print("Enter the number of the Technical Doubt from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 sc.nextLine();  //getting the password of user for checking
		 System.out.print("Enter ur password for confirmation: ");
		 String confirmPassword = sc.nextLine();
		 //checking whether the user is HR or the same user who posted
		 int delIndex = deleteNumber-1; 
		 deleteNumber = deleteNumber-1;
		 if(deleteNumber <= TDstr.size()) {
		 String TDdel = TDstr.get(delIndex);
		 String delEmail = TDdel.substring((TDdel.indexOf("by")+3),(TDdel.indexOf(".com")+4) );  //for getting author email
		// System.out.println("deleting post email: "+delEmail);
		 //boolean ifcond = (email.equalsIgnoreCase(delEmail) && confirmPassword.equals(password));
		 //System.out.println(ifcond);
		 if( (email.equalsIgnoreCase(delEmail) && confirmPassword.equals(password)) || confirmPassword.equals("Hr@12345")) {
			 
			 TDstr.remove(deleteNumber);
			 System.out.println("");
			 System.out.println("******************************************Technical Doubts list after deletion********************************************");
			 TDdisplay();
		 }else {	
			 System.out.println();
			 System.out.println("only HR or the user who posted can delete this post");
		 }
	 }else {
		  System.out.println("");
		  System.out.println("Invalid Input"); 
		  System.out.println("");
		  System.out.println("*************************************************Technical Doubts list*******************************************************");
		  TDdisplay();
		 }
	}
	
	public void TDAns(String email, String password) {   // for answering
		System.out.println("");
		System.out.print("Enter the desired question number of the Technical Doubt from the above list to Answer/comment:");
		int AnsNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Your comment/answer for the question "+AnsNumber+" is :");
		String TDAnswer = sc.nextLine();
	    int index =AnsNumber-1;
		TDAnswer = TDstr.get(index) +"  ("+AnsNumber+"A. "+TDAnswer+ " by "+email+")";
		TDstr.set(index, TDAnswer);
		System.out.println("**************************************************Technical Doubts list******************************************************");
//		TDstr.add(TDAnswer);
//		 Collections.sort(TDstr);
	}
	
	public void TDsearch() {
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		System.out.println("***************************************Technical Doubts list after filtering**************************************");
		 System.out.println("");
		int j =1;
		for (String i : TDstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	public void TDback(String email,String password) {
		//for going back to the services/functionalities or for choosing other functions of Innovative thoughts
				System.out.println("");
				 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for Technical Doubts other functions or press 3 for exit: ");
				 int goback = sc.nextInt();
				 if(goback == 1) {
					 BackToCRUD BTC= new BackToCRUD();
					 BTC.BackToCRUD(email, password);
				 }else if(goback == 3){
					 System.out.println();
					 System.out.println("***************************************************Have a great day*******************************************************");
				 }else if(goback == 2) {
					 TD(email, password);
				 }
	}
	
	

}
