package browserhistory;
import java.util.Scanner;  
import java.util.Stack;

public class Browser {
	private static Stack<String> history = new  Stack<String>();
	static Scanner s = new Scanner(System.in);
	public static void display() {

		System.out.println("1 for Browser History is Existed or Not.");
		System.out.println("2 for Most Recently Visited Site.");
		System.out.println("3 for To add Sites History.");
		System.out.println("4 for Back How Many Websites.");
		System.out.println("5 for Display.");
		System.out.println("6 for Exit.");
		System.out.println("\n\n");
		
		System.out.print("Enter Your choice: ");
		int choice = s.nextInt();
		switch(choice){
		
		case 1:

			System.out.println("History is Empty: " +isBrowsingHistoryEmpty());
			break;
		case 2:
			
			System.out.println("Most Recent call is: "+mostRecentlyVisitedSite());
		
			break;
		case 3:

			System.out.print("How much Sites you Want to add: ");
			int site = s.nextInt();
			for(int i = 0; i < site; i++) {
	    	System.out.print("Enter "+(i+1)+" site name: ");
	    	String url = s.next();
	    	addSiteToHistory(url);
			}
			
			break;
		default:
			System.out.println("Please Choose a Correct Option");
			display();

		}
		
		
		
		
	}
	// Check History is Empty or not
	public static Boolean isBrowsingHistoryEmpty() {
	    
		if(history.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
public static String mostRecentlyVisitedSite() {
		
		if(history.isEmpty()== true) {
			return "History is Empty";
		}
		else {
			return history.peek();
		}
	}

	//Push Element
	public static void addSiteToHistory(String url) {
	history.push(url);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();

	}

}
