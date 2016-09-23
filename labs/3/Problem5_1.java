/**
 * file: problem5_1.java
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
public class Problem5_1 {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
    System.out.print(" Enter an integer, the input ends if it is 0: ");
    int p = input.nextInt();
	
    int np = 0;
    int nn = 0;
    double sumn = 0;
    double avgn = 0;
		
    if (p == 0)
	  return;
  
    do {
	  if (p>0)
	    np++;
	  else
	    nn++;
	  sumn += p;
	  p = input.nextInt();
    } 
    while (p != 0);
	
    avgn = sumn / ((double)(np + nn));
		
    System.out.println(" The number of positives is " + np);
    System.out.println(" The number of negatives is " + nn);
    System.out.println(" The total is " + sumn);
    System.out.println(" The average is " + avgn);
 }
}