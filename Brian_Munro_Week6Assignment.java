// Brian Munro

import java.util.Scanner;
import java.lang.Math;

public class Brian_Munro_Week6Assignment {

	public static void main(String[] args) {
		//instantiate new Scanner object
		Scanner input = new Scanner(System.in);
		
		//Part One
		
		//instantate sum for calculating average
		int sum = 0;
		
		//Print header
		dashedLine();
		System.out.println("Part 1: for loop: Average of randomly generated integers");
		dashedLine();
		
		//Have user enter perameters
		System.out.print("Enter the bottom number of the range: ");
		int min = input.nextInt();
		System.out.print("Enter the top number of the range: ");
		int max = input.nextInt();
		System.out.print("Enter how many numbers to generate: ");
		int num = input.nextInt();
		System.out.print("Random numbers generated: ");
		
		//Generate and print random numbers
		for (int i = 0; i < num; i++) {
			int randNum = (int)((Math.random() * ((max - min) + 1)) + min);
			sum += randNum;
			System.out.print(randNum + " ");
		}
		
		System.out.println();
		
		//calculate and print average
		System.out.printf("Average of generated numbers: %d\n", (sum/num));
		
		dashedLine();
		
		//Part Two
		System.out.println();
		System.out.println("Part 2: while loop: Average of user-entered integers using While loop");
		dashedLine();
		System.out.println("Enter integers to average.  Enter -1 to finish.");
		
		//reset sum for new average and num for loop break.  Instantiate entry counter
		sum = 0;
		num = 0;
		int entry = 0;
		
		//while loop asking user to enter integers
		while(num != -1) {
			entry++;
			System.out.print("Entry " + (entry) + ": ");
			num = input.nextInt();			
			
			//if statement to make sure the final -1 is not calculated in the average.
			if(num != -1){sum += num;}
		}
		
		//Calculate and print total entries
		System.out.printf("Number of entries: %d\n", entry-1);
		
		//Calculate average if an integer was entered
		if(entry == 1) {
			System.out.println("Average not available.  No integers entered.");
		}
		else{
			System.out.println("Average of user-entered numbers: " + (sum/(entry-1)));
		}
		dashedLine();
		
		//Part Three
		System.out.println();
		System.out.println("Part 3: do-while loop: Display menu until user chooses to exit");
		dashedLine();
		
		//instantiate variable for user choice
		int choice = 0;
		
		
		do {
			//print menu
			doubleDash();
			System.out.println("MENU");
			doubleDash();
			System.out.print("1: Choice 1\n2: Choice 2\n3: Choice 3\n4: Exit\n");
			doubleDash();
			System.out.print("Enter 1, 2, 3 or 4 to Exit: ");
			choice = input.nextInt();
			
			//validate user choice
			switch(choice){
				case 1: break;
				case 2: break;
				case 3: break;
				case 4: System.out.print("Goodbye!");
					break;			
				default: System.out.println("Please choose a valid option.");
					break;
			}			
		}while(choice != 4);
		
		
	}

	private static void doubleDash() {
		//print double dashed line for organization
		for (int i = 0; i < 30; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	private static void dashedLine() {
		//Print dashed line for organization
		for(int i=0; i<69; i++) {
			System.out.print("-");
		}
		System.out.println();		
	}

}
