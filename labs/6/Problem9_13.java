/**
 * file: problem9_13.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 6
 * due date: October 20, 2016
 * version: 1.8.0_102
 * 
 */
 import java.util.Scanner;
public class Problem9_13{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the numbers of rows and columns in the array: ");
	int row = input.nextInt();
	int column = input.nextInt();
	double[][]rc = new double [row][column];
	
	System.out.println("Enter the array: ");
    for(int i = 0; i < rc.length; i++){
	  for(int k = 0; k < rc[i].length; k++){
	    rc[i][k] = input.nextDouble();
	  }
    }	
	
	Location location = Location.locateLargest(rc);
	
	System.out.println("The location of the largest element is "
    + location.maxValue + " at (" + location.row + ", " + location.column + ")");
  }
}
