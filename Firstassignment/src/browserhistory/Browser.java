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
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();

	}

}
