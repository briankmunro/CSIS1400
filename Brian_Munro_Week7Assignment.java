/* Brian Munro

This program analyzes random scores based on user inputs
The user will select how many teams will play how many games.
The program will generate scores and evaluate the top team.
*/

//importing java classes used in the proram
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class Brian_Munro_Week7Assignment {

	public static void main(String[] args) {
		//instantiate scanner and variable for user input
		Scanner input = new Scanner(System.in);
		int teams;
		int games;
		
		//print header and collect user input
		printline(50);
		System.out.println("Football Team Randomized Season Scores");
		printline(50);
		System.out.print("Enter the number of teams: ");
		teams = input.nextInt();
		System.out.print("Enter the number of games: ");
		games = input.nextInt();
		printline(50);
		System.out.print("Team\tScores");
		
		//loop ensures proper scoreboard spacing
		for(int i=3; i<games; i++) {
			System.out.print("   ");
		}
		System.out.print("\tTot\tAvg\n");
		printline((25+(3*games)));
		
		//instantiate variable for generating scores and evaluating totals
		int min = 10;
		int max = 60;
		int topTeamTotal = 0;
		int teamTotal = 0;
		int topTeam = 0;		
		Integer[] teamSeason = new Integer[games];
		
		//instantiate two-dimensional array
		int[][] season = new int [teams][games];
		
		//loops nested to assign random values to rows and columns
		for(int i=0; i<teams; i++) {
			teamTotal = 0;
			for(int j=0; j<games; j++) {
				season[i][j] = (int)((Math.random() * ((max - min) + 1)) + min);
				teamTotal = teamTotal + season[i][j];
			}
			
			//new array for storing row totals
			teamSeason[i]=teamTotal;
			
			//compares team totals to keep track of highest scoring team
			if(teamTotal>topTeamTotal) {
				topTeamTotal = teamTotal;
				topTeam = i+1;
				}
		}
		
		//loops nested to print scoreboard by row then column.
		for(int i=0; i<teams; i++) {
			System.out.print((i+1)+":\t");
			
			for(int j=0; j<games; j++) {
				System.out.print(season[i][j] + " ");
			}
			System.out.print("\t" + teamSeason[i] + "\t" + (teamSeason[i]/games) + "\n");
		}
		
		//print footer with top scoring team number.
		printline((25+(3*games)));
		System.out.println("Top Team: " + topTeam);
		printline(50);
		
		
		

	}

	//Method prints a dashed line for console organization
	private static void printline(int dash) {
		for(int i = 0; i<=dash; i++) {
			System.out.print("-");
		}	
		System.out.println();
	}

}
