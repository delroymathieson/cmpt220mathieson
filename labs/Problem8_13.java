/**
 * file: Problem7_32.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: Lab 5 
 * due date: October 6, 2016
 * version: 1.8.0_102
 * 
 */
import java.util.Scanner;
public class Problem8_13{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of rows and columns of the array: ");
	  
	  int n = input.nextInt();
	  int q = input.nextInt();
	  int[] intResult;

    System.out.println("Enter the Array: ");
	  double [][] ny = new double [n][q];
	  for(int i = 0; i < n; i++){
	    for(int i2 = 0; i2 < q; i2++){
	  	  ny[i][i2] = input.nextDouble();
	  	}
	  }
    intResult = locLargest(ny);
	System.out.println("The location of the largest element is at(" + 
    intResult [0] + "," + intResult[1] + ")");
	}
    public static int[] locLargest(double[][] a){
      double doubleMax = 0;
	  int[] intReturn = new int[2];

	  for (int i = 0; i < a.length; i++){
	    for (int i2 = 0; i2 < a[i].length; i2++){
	  	  if(a[i][i2] > doubleMax){
	  	    doubleMax = a[i][i2];
	  	    intReturn[0] = i;
	  	    intReturn[1] = i2;
	  	  }
	  	}
	  }
	return intReturn;
   }
}