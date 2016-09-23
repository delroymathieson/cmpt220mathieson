/**
 * file: problem5_7.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 3
 * due date: September 22, 2016
 * version: 1.8.0_102
 * 
 * 
 * 
 */

import java.util.Scanner;
public class Problem5_7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    double tution = 10000;
    double interest = .05;
	double lastFour = 0;
	
	System.out.printf("%-10s %s\n" , "Year(s)" , "Cost");
	
    for (int i = 0; i <= 14; i++){
      if(i <= 10){
	    System.out.printf("%-10s %.2f \n" , i , tution);
	    tution += (tution * interest);
	}
	  else
	    lastFour += tution + (tution * interest);
    }
       System.out.printf("%s %.2f" , "Tution after four years is $" , lastFour);	
 }	
}
