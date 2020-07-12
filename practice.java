import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		int userChoice = 0;
		Scanner input = new Scanner(System.in);
		
		displayMenu();		
		
		userChoice = input.nextInt();
		
		if(userChoice == 1) {
			System.out.println("Hello!");
		}
		else if(userChoice == 2){
			addXY();
		}
		else if(userChoice == 3){
			input.close();
		}
		
		
	}

	private static void addXY() {
		int x = 45;
		int y = 34;
		System.out.printf("x is %d, y is %d, x + y = %d.",x,y,x+y);
		
	}

	private static void displayMenu() {
		System.out.println("---------------");
		System.out.println("MENU");
		System.out.println("---------------");
		System.out.println("1. Print Message");
		System.out.println("2. Add x and y");
		System.out.println("3. Exit");
		System.out.println("---------------");
		System.out.println("Enter 1, 2 or 3:");
		
	}

}
