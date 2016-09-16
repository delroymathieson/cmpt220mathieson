/**
 * file: problem4_15.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file 
 * type.
 */
  import java.util.Scanner;
public class problem4_25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	int numbers = (int)(Math.random() * 1000 + 1000);
	
	char firstChar = (char) (Math.random() * 26 + 65);
	char secondChar = (char) (Math.random() * 26 + 65);
	char thirdChar = (char) (Math.random() * 26 + 65);
	
	System.out.println(" Your Plate number is " + firstChar + secondChar + thirdChar + numbers);

  }
}