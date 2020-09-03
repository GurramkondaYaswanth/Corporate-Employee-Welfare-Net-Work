package Service;

//import java.awt.Image;
//import java.io.IOException;
//import java.io.InputStream;
//import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Scanner;



public class CompanyEvents {
	ArrayList<String> CEstr = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	public void photoshare(String email,String password)  {
//		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//		InputStream input = classLoader.getResourceAsStream("event1.jpg");
//		Image logo = ImageIO.read(input);
//		System.out.println(logo);
		System.out.println("");
		System.out.println("*************************************************Company Events photo share****************************************************");
		//adding some default Company Events links
				if(CEstr.size() == 0) {
					CEstr.add("Company Annual Day    https://www.google.com/search?q=company+events&rlz=1C1CHBF_enIN813IN813&hl=en&sxsrf=ALeKk0265DD0h8nh7kG4bDMcgkHfWKxYmg:1598958715810&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiOrJCy6cfrAhU14jgGHdJ0CCIQ_AUoAXoECBoQAw&biw=1707&bih=838&dpr=1.13");
					CEstr.add("TradeShow             https://www.google.com/search?q=Trade+Show+company+events&rlz=1C1CHBF_enIN813IN813&sxsrf=ALeKk02hs38KezXzbehJKC9G-jU2869BRw:1599051744350&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjB-cv5w8rrAhVLU30KHUuaBAkQ_AUoAXoECBAQAw&biw=1707&bih=838&dpr=1.13 ");
					
				}
		if(email.equalsIgnoreCase("Hr@gmail.com")) {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view the events photos link or 2 to add other events phots link or 3 to delete the link or 4 to search: ");
		int CEviewPostDel = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		
		
		if(CEviewPostDel == 1) { //viewing
			System.out.println("*********************************************Company Events photo share links ***********************************************");
			CEdisplay();
			CEback(email,password);
		}else if(CEviewPostDel == 2) { //posting
			
				CEPost(email, password); 
				CEdisplay();
				CEback(email,password);
			
			
		}else if(CEviewPostDel == 3) { //delete
			 CEdisplay();
			 CEdelete(email, password);
			 CEdisplay();
			 CEback(email,password);
		}else if(CEviewPostDel == 4) { //search
			 CEsearch();
			 CEback(email,password);
		}
		
		
	}else {
		System.out.println("");
		//for getting the desired option/functionality of this service
		System.out.print("Enter 1 to view view the events photos link or 2 to search: ");
		int CEviewPostDelSearch1 = sc.nextInt();
		sc.nextLine();
		if(CEviewPostDelSearch1 == 1) {
			CEdisplay();
			CEback(email,password);
		}else if(CEviewPostDelSearch1 == 2) {
			CEsearch();
			CEback(email,password);
		}
	}
}
	
	   
	public void CEdisplay() {  //for displaying
		System.out.println("Event                    Eventlink");
		int j =1;
		 for (String i : CEstr) {
		      System.out.println(j+". "+i);
		      j++;
		    }
		}
	public void CEPost(String email, String password) {  //for posting
			System.out.print("Event: ");
			String Event = sc.nextLine();
			System.out.print("Eventlink: ");
			String Eventlink = sc.nextLine();
			int spaces = 22- (Event.length());
			if(spaces<0) {
				spaces = 0;
			}
			for(int i=0; i<spaces; i++) {
				Event = Event + " "; 
			}
			String post = Event+Eventlink;  
			CEstr.add(post);
			System.out.println("");
			System.out.println("***************************************Company Events photo share links after adding ****************************************");
			
		}
	
	public void CEdelete(String email, String password){   //for deleting
		 System.out.print("Enter the number of the innovative thought from the above list to delete: ");
		 int deleteNumber = sc.nextInt();
		 deleteNumber = deleteNumber-1;
		 CEstr.remove(deleteNumber);
		 System.out.println("");
		 System.out.println("***************************************Company Events photo share links after deleting *************************************");
	}
	
	public void CEsearch() {
		System.out.println("");
		System.out.print("search word (Lower case): ");
		String search = sc.nextLine();
		System.out.println("***************************************Company Events photo share links after filtering**************************************");
		 System.out.println("");
		 System.out.println("Event                    Eventlink");
		int j =1;
		for (String i : CEstr) {
			String str = i.toLowerCase();
			if(str.contains(search)) {
		      System.out.println(j+". "+i);
			}
		    j++;
		}	
	}
	
	public void CEback(String email,String password) {   //for going back to the services/functionalities
		System.out.println();
		System.out.println("");
		 System.out.print("If u want to go back to services/functionalities press 1 or press 2 for going back to company events photoshare links or press 3 for exit: ");
		 int goback = sc.nextInt();
		 if(goback == 1) {
			 BackToCRUD BTC= new BackToCRUD();
			 BTC.BackToCRUD(email,password);
		 }else if(goback == 3){
				System.out.println("");
			 System.out.println("***************************************************Have a great day*******************************************************");
		 }else if(goback == 2) {
			 photoshare(email,password);
			 
		 }
	}
	
}
