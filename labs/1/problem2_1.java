/**
 * file: problem2_1.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 1
 * due date: September 7, 2016
 * version: 1.8.0_102
 * 
 * This file converts celsius to fahrenheit.
 */
 import java.util.Scanner;
public class problem2_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    System.out.println("Enter a degree in Celsius: ");
	double c = input.nextDouble();
	
	double f = ((9.0/5.0) * c + 32.0);
	System.out.println( c + " Celsius converts to " + f + " in Fahrenheit");
  }
}
 