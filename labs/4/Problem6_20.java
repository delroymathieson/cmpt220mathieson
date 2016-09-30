/**
 * file: problem6_20.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 4
 * due date: September 29, 2016
 * version: 1.8.0_102
 * 
 * Counts and adds a string.
 * 
 */
import java.util.Scanner;
public class Problem6_20{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    System.out.print(countLetters(input.nextLine()) + " Letters were counted");
    input.close();
  }
 
  public static int countLetters(String s){
    int letterCounter = 0;
    for (int i = 0; i < s.length(); i++)
      if(Character.isLetter(s.charAt(i)))
	    letterCounter++;
    
	return letterCounter;
 }
}
  