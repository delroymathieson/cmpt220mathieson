/**
 * file: problem2_6.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 1
 * due date: September 7, 2016
 * version: 1.8.0_102
 * 
 * This file sums the digits in an integer
 */
// == incorrect indentation
 import java.util.Scanner;
public class problem2_6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    // == you are using tabs!!!
	System.out.println(" Enter a number between 0 and 1000: ");
	
	int number = input.nextInt();
	
	int number1 = number % 10;
	int remainingNumber = number / 10;
	int number2 = remainingNumber % 10;
	remainingNumber = remainingNumber / 10;
	int number3 = remainingNumber % 10;
	
    int sum =  number1 + number3 + number2 ;
	
	System.out.println(" The sum of the digitals is " +  sum);
  }
}
