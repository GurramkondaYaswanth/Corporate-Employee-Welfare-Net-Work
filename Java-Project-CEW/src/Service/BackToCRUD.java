package Service;
import java.util.Scanner;
public class BackToCRUD {
	Scanner sc = new Scanner(System.in);
	public void BackToCRUD(String email,String password) {
		System.out.println("");
		System.out.println("1. Innovative thoughts");
		System.out.println("2. All Company Events(photos share)");
		System.out.println("3. Technical doughts");
		System.out.println("4. Work experience");
		System.out.println("5. Personal relating things( Property sales and Home rent )");
		System.out.println("6. All company growth(share market)");
		System.out.println("7. Job vacancy");
		System.out.println("8. Matrimonial");
		System.out.println("9. Birth days");
		System.out.println("10.Travel / Picnic / Get together Plans");
	System.out.print("Enter one number from the above services to view or add details: ");
	int FunctionalityNumber = sc.nextInt(); 
	CRUDoperations CO = new CRUDoperations();
	CO.functionality(FunctionalityNumber,email,password);
	}
}
