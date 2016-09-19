/**
 * file: problem2_5.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 1
 * due date: September 7, 2016
 * version: 1.8.0_102
 * 
 * This file calculate tips.
 */
// == incorrect indentation
 import java.util.Scanner;
public class problem2_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    // == you are using tabs!!!
	double gratuityRate ;
	double totalTips;
	double total;
	double subtotal;
	
    System.out.println(" Enter Gratuity Rate: ");
	gratuityRate = input.nextDouble();
	System.out.println(" Enter Subtotal: ");
	subtotal = input.nextDouble();
	
    // == this formula is wrong
	totalTips = (gratuityRate / 100);
	total = subtotal + totalTips;
	
	System.out.println(" The gratuity is $ " + totalTips + " and the total is $ " + total);
  }
}
 
