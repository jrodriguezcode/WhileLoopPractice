// Special thanks to Bro Code for his videos
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * while loop = executes a block of code as long as its condition remains true
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = in.nextLine();
		}
		
		// a do loop guarantees that the code will run at least once
//		do {
//			System.out.print("Enter your name: ");
//		name = in.nextLine();
//		}while(name.isBlank());
		
		System.out.println("Hello " + name);
	}

}
