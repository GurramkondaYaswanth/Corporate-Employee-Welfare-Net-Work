package Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CompanyGrowth {
	ArrayList<String> CGstr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	public void CG(String email,String password)  {
		System.out.println("");
		System.out.println("*****************************************************Company Growth*********************************************************");
		//adding some default Company Growth links
		if(CGstr.size() == 0) {
			CGstr.add("GOOGLE’S INCREDIBLE GROWTH TIMELINE:   https://edition.cnn.com/interactive/2018/12/business/google-history-timeline/index.html    posted on: 2/9/20 19:30");
			CGstr.add("RELIANCE GROWTH HISTORY:   https://en.wikipedia.org/wiki/Reliance_Industries#History    posted on: 2/9/20 19:30");		
		}
		
		if(email.equalsIgnoreCase("Hr@gmail.com")) {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view the Company Growth link or 2 to add the link or 3 to delete the link or 4 to search: ");
		int CGviewPostDel = sc.nextInt();
		sc.nextLine();
		System.out.println("");
	
		
		if(CGviewPostDel == 1) { //viewing
			System.out.println("****************************************************Company Growth links ****************************************************");
			CGdisplay();
			CGback(email,password);
		}else if(CGviewPostDel == 2) { //posting
			
				CGPost(email, password); 
				CGdisplay();
				CGback(email,password);
			
			
		}else if(CGviewPostDel == 3) { //delete
			 CGdisplay();
			 CGdelete(email, password);
			 CGdisplay();
			 CGback(email,password);
		}else if(CGviewPostDel == 4) { //search
			 CGsearch();
			 CGback(email,password);
		}
		
		
	}else {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view view the Company Growth links or 2 to search: ");
		int CEviewPostDelSearch1 = sc.nextInt();
		sc.nextLine();
		if(CEviewPostDelSearch1 == 1) {
			CGdisplay();
			CGback(email,password);
		}else if(CEviewPostDelSearch1 == 2) {
			CGsearch();
			CGback(email,password);
		}
		}
	}
	
	public void CGdisplay() {  //for displaying
		
		int j =1;
		 for (String i : CGstr) {
		      System.out.println(j+". "+i);
		      j++;
		    }
		}
	
	public void CGPost(String email, String password) {  //for posting
		System.out.print("tiltle: ");
		String tiltle = sc.nextLine();
		System.out.print("Growthlink: ");
		String Growthlink = sc.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");  //current time and date
	    Date dateobj = new Date();
	    //System.out.println(df.format(dateobj));
		String post = tiltle+":  "+Growthlink +"   posted on: "+df.format(dateobj);  
		CGstr.add(post);
		System.out.println("");
		System.out.println("***************************************Company Growth links after adding ****************************************");	
	}
	
	public void CGdelete(String email, String password){  //for deleting
		 System.out.print("Enter the number of the Company Growth link from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 deleteNumber = deleteNumber-1;
		 if(deleteNumber <= CGstr.size()) {
		 CGstr.remove(deleteNumber);
		 System.out.println("");
		 System.out.println("***************************************Company Growth links after deleting ***************************************");
	}else {
		  System.out.println("");
		  System.out.println("Invalid Input"); 
		  System.out.println("");
		  System.out.println("*********************************************************Company Growth***************************************************************");
		 }
	}
	
	public void CGsearch() {
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		System.out.println("*********************************************Company Growth links after filtering***********************************************");
		 System.out.println("");
		int j =1;
		for (String i : CGstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	public void CGback(String email,String password) {   //for going back to the services/functionalities
		System.out.println();
		System.out.println("");
		 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for going back to company Growth links or press 3 for exit: ");
		 int goback = sc.nextInt();
		 if(goback == 1) {
			 BackToCRUD BTC= new BackToCRUD();
			 BTC.BackToCRUD(email,password);
		 }else if(goback == 3){
			 System.out.println("");
			 System.out.println("***************************************************Have a great day*******************************************************");
		 }else if(goback == 2) {
			 CG(email,password);
			 
		 }
	}

}
