/**
 * file: problem4_8.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file recieves an ASCII code
 * 
 */
  import java.util.Scanner;
public class problem4_8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    System.out.println(" Enter an ASCII code: ");
	int asciiNum = input.nextInt();
	
	input.close();
	System.out.println("The character for ASCII code " + asciiNum + " is " + (char)asciiNum );
  }
}