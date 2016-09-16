/**
 * file: problem4_1.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file allows the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon.
 * 
 */
  import java.util.Scanner;
public class problem4_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter the length from the center to the vertex: ");
	
	double radius = input.nextDouble();
	double s = 2 * radius * Math.sin(Math.PI / 5);
	double area = (5 * s * s) / (4 * Math.tan(Math.PI/5));
	
	input.close();
	System.out.println("The area of the pentagon is: " + area);
  }
}