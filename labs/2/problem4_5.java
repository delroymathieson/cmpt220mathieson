/**
 * file: problem4_5.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file calculates the area of a polygon.
 * 
 */
  import java.util.Scanner;
public class problem4_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    System.out.println(" Enter the number sides: ");
	double numSide = input.nextDouble();
	
	System.out.println(" Enter the side: ");
	double side = input.nextDouble();
	
	double area = (numSide * side * side) / (4 * Math.tan(Math.PI/numSide));
	
	input.close();
	System.out.println("The area of the polygon is: " + area);
  }
}