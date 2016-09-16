/**
 * file: problem4_26.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file computes change. 
 * 
 */
 import java.util.Scanner;
 
 public class problem4_26 {
   public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
   
   System.out.print( "Enter an amount in dollars and cents: ");
   String amount = input.next();
   
   int numberOfDollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
   int numberOfCents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
  
   // Find the number of quarters in the remaining amount
   int numberOfQuarters = numberOfCents / 25;
   numberOfCents = numberOfCents % 25;

   // Find the number of dimes in the remaining amount
   int numberOfDimes = numberOfCents / 10;
   numberOfCents = numberOfCents % 10;

   // Find the number of nickels in the remaining amount
   int numberOfNickels = numberOfCents / 5;
   numberOfCents = numberOfCents % 5;

   // Find the number of pennies in the remaining amount
   int numberOfPennies = numberOfCents;

   // Display results
   System.out.println("Your amount " + amount + " consists of");
   System.out.println(" " + numberOfDollars + " dollars");
   System.out.println(" " + numberOfQuarters + " quarters ");
   System.out.println(" " + numberOfDimes + " dimes");
   System.out.println(" " + numberOfNickels + " nickels");
   System.out.println(" " + numberOfPennies + " pennies");
   
   input.close();
  }
}
