package Service;

import java.util.ArrayList;
import java.util.Scanner;

import model.User;

public class InnovativeThoughts {
	//User user = new User();
	ArrayList<String> ITstr = new ArrayList<String>();
	//convertPdf CPdf = new convertPdf();
	Scanner sc = new Scanner(System.in);
	public void IT(String email,String password) {  //function which takes the input for the functions of innovative thoughts
		System.out.println("");
		System.out.println("***************************************************Innovative thoughts*******************************************************");
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view all the Innovative Thoughts or 2 to post your Ideas or 3 to delete ur previous posts or 4 to search: ");
		int ITviewPost = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		//adding some default innovative thoughts
		if(ITstr.size() == 0) {
			ITstr.add("Innovation distinguishes between a leader and a follower – Steve Jobs- by gurramkondayaswanth@gmail.com");
			ITstr.add("Innovation is not the product of logical thought, although the result is tied to logical structure – Albert Einstein- by gurramkondayaswanth@gmail.com");
			ITstr.add("Business innovation doesn’t mean that you must to create something new. Business innovation also means that you can improve something old or existing- by gurramkondayaswanth@gmail.com");
			
		}
		//for displaying the list
		if(ITviewPost == 1) {
			System.out.println("************************************************Innovative thoughts list*****************************************************");
			ITdisplay();
			 ITback(email, password);
		}else if(ITviewPost == 2) {         //for adding the innovative thoughts list
			ITPost(email, password);
			ITdisplay();
			ITback(email, password);
		}else if(ITviewPost == 3) {  //for deleting the innovative thought that is posted
			ITdisplay();//getting the index of the innovative thought that is want to be deleted
			ITdelete(email, password);
			 ITback(email, password);
		}else if(ITviewPost == 4) {      //for searching
			ITsearch();
			ITback(email,password);
		}
	}
	
	
	public void ITdisplay() {    //for displaying
		
		int j =1;
		 for (String i : ITstr) {
		      System.out.println(j+". "+i);
		      //CPdf.pdf(i);
		      j++;
		    }
		
	}
	
	public void ITPost(String email, String password) {  //for posting
		System.out.print("Your innovative Idea: ");
		String newThough = sc.nextLine();
		newThough=newThough+ " by "+email;
		ITstr.add(newThough);
		System.out.println("");
		System.out.println("**************************************Innovative thoughts list after adding ur thought***************************************");
	}
	
	public void ITdelete(String email, String password) {    //for deleting
		System.out.println("");
		System.out.print("Enter the number of the innovative thought from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 sc.nextLine();  //getting the password of user for checking
		 System.out.print("Enter ur password for confirmation: ");
		 String confirmPassword = sc.nextLine();
		 //checking whether the user is HR or the same user who posted
		 int index = deleteNumber-1;
		 deleteNumber = deleteNumber-1;
		 if(deleteNumber <= ITstr.size()) {
		 String ITdel = ITstr.get(index);
		 String delEmail = ITdel.substring(ITdel.lastIndexOf(" ")+1);
		 //System.out.println("deleting post email: "+delEmail);
		 
		 if( (email.equalsIgnoreCase(delEmail) && confirmPassword.equals(password)) || confirmPassword.equals("Hr@12345")) {
			 
			 ITstr.remove(deleteNumber);
			 System.out.println("");
			 System.out.println("******************************************Innovative thoughts list after deletion********************************************");
			 ITdisplay();
		 }else {
			 System.out.println();
			 System.out.println("only HR or the user who posted can delet this post");	 
		 }
		 }else {
			  System.out.println("");
			  System.out.println("Invalid Input"); 
			  System.out.println("");
			  System.out.println("*********************************************************Innovative thoughts***************************************************************");
			  ITdisplay();
			 }
	}
	
	public void ITsearch() {      //for filtering
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		System.out.println("***************************************Innovative thoughts list after filtering**************************************");
		 System.out.println("");
		int j =1;
		for (String i : ITstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {          //checking whether the word is in the string
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	
	public void ITback(String email,String password) {
		//for going back to the services/functionalities or for choosing other functions of Innovative thoughts
		//Scanner sc = new Scanner(System.in);
				System.out.println("");
				 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for Innovative thoughts other functions or press 3 for exit: ");
				 int goback = sc.nextInt();
				 if(goback == 1) {
					 BackToCRUD BTC= new BackToCRUD();
					 BTC.BackToCRUD(email, password);
				 }else if(goback == 3){
					 System.out.println();
					 System.out.println("***************************************************Have a great day*******************************************************");
				 }else if(goback == 2) {
					 IT(email, password);
				 }
	}
	
}


