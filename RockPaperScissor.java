package day.one;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rGen = new Random();
		String name;
		String userPick;
		String compPick;
		int randNum = rGen.nextInt(3);
		int userWins = 0;
		int computerWins = 0;

		// Welcome user to the app
		System.out.println("Welcome to Roshambo!");

		// Ask user their name
		System.out.print("Please enter your name:");
		name = scan.nextLine();

		System.out.println("Welcome " + name);

		System.out.println("Please pick rock, paper, or scissors");
		userPick = scan.nextLine();

		if (randNum == 0) {
			compPick = "rock";
		} else if (randNum == 1) {
			compPick = "paper";
		} else {
			compPick = "scissors";
		}

		System.out.println(name + " picked " + userPick);
		System.out.println("The computer picked " + compPick);

		if(userPick.equalsIgnoreCase("rock")) {
			if(compPick.equals("rock")) {
				System.out.println("Tie");
			} else if(compPick.equals("paper")) {
				System.out.println("Computer Wins");
				computerWins++;
			} else {
				System.out.println(name + " wins!");
				userWins++;
			}
		} else if(userPick.equalsIgnoreCase("paper")) {
			if(compPick.equals("rock")) {
				System.out.println(name + " wins!");
				userWins++;
			} else if(compPick.equals("paper")) {
				System.out.println("Tie");
			} else {
				System.out.println("Computer Wins");
				computerWins++;
			}
		} else if(userPick.equalsIgnoreCase("scissors")) {
			if(compPick.equals("rock")) {
				System.out.println("Computer Wins");
				computerWins++;
			} else if(compPick.equals("paper")) {
				System.out.println(name + " wins!");
				userWins++;
			} else {
				System.out.println("Tie");
			}
		}

		scan.close();
	}
}
