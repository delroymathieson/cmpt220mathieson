/**
 * file: problem3_15.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file
 * 
 */	
import java.util.Scanner;
public class problem3_15 {
  public static void main(String[] args) {
  // Generate a lottery number
  int lottery = (int)(Math.random() * 100);

  // Prompt the user to enter a guess
  Scanner input = new Scanner(System.in);
  System.out.print("Enter your lottery pick (two digits): ");
  int guess = input.nextInt();

  // Get digits from lottery
  int lotteryDigit1 = lottery / 10;
  int lotteryDigit2 = lottery % 10;

  // Get digits from guess
  int guessDigit1 = guess / 10;
  int guessDigit2 = guess % 10;

  System.out.println("The lottery number is " + lottery);

  // Check the guess
  switch(guess == lottery){
    case 1: System.out.println("Exact match: you win $10,000"); break;
	case 2: System.out.println("Match all digits: you win $3,000"); break;
	case 3: System.out.println("Match one digit: you win $1,000"); break;
	case 4: System.out.println("Sorry, no match"); break;
	}
	
  switch(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2){
    case 1: System.out.println("Exact match: you win $10,000"); break;
	case 2: System.out.println("Match all digits: you win $3,000"); break;
	case 3: System.out.println("Match one digit: you win $1,000"); break;
	case 4: System.out.println("Sorry, no match"); break;
    }
	
  switch(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2){
    case 1: System.out.println("Exact match: you win $10,000"); break;
	case 2: System.out.println("Match all digits: you win $3,000"); break;
	case 3: System.out.println("Match one digit: you win $1,000"); break;
	case 4: System.out.println("Sorry, no match"); break;
    }	
  }
}
	
	
	
	
	
	
	
	
	
	
	
	