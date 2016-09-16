/**
 * file: problem4_15.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file allows users to enter a letter and display corresponding number.
 * 
 */
  import java.util.Scanner;
public class problem4_15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    System.out.println(" Enter a letter code: ");
	char s = input.next().charAt(0);
	
	if (s == 'A' || s == 'B' || s == 'C' ||
	        s == 'a' || s == 'b' || s == 'c' )
     
	 {
		 System.out.println("The corresponding number is 2 ");
	 }
	 
	 else if (s == 'D' || s == 'E' || s == 'F' ||
	        s == 'd' || s == 'e' || s == 'f' )
     
	 {
		 System.out.println("The corresponding number is 3 ");
	 }
	 
	 else if (s == 'G' || s == 'H' || s == 'I' ||
	        s == 'g' || s == 'h' || s == 'i' )
     
	 {
	    System.out.println("The corresponding number is 4 ");
	 }
	 
	 else if (s == 'J' || s == 'K' || s == 'L' ||
	        s == 'j' || s == 'k' || s == 'l' )
     
	 {
		 System.out.println("The corresponding number is 5 ");
	 }
	 
	 else if (s == 'M' || s == 'N' || s == 'O' ||
	        s == 'm' || s == 'n' || s == 'o' )
     
	 {
		 System.out.println("The corresponding number is 6 ");
	 }
	 
	 else if (s == 'P' || s == 'Q' || s == 'R' || s == 'S' || 
	        s == 'p' || s == 'q' || s == 'r' || s == 's' )
     
	 {
		 System.out.println("The corresponding number is 7 ");
	 }
	 
	 else if (s == 'T' || s == 'U' || s == 'V' ||
	        s == 't' || s == 'u' || s == 'v' )
     
	 {
		 System.out.println("The corresponding number is 8 ");
	 }
	
	 else if (s == 'W' || s == 'X' || s == 'Y' || s == 'Z' || 
	        s == 'w' || s == 'x' || s == 'y' || s == 'z' )
     
	 {
		 System.out.println("The corresponding number is 9 ");
	 }
	
	input.close();
  }
}