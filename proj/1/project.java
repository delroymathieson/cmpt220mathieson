/**
 * file: 
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: Project 1
 * due date: October 4, 2016
 * version: 1.8.0_102
 * 

 *
 *	1) The size of the first vector.
 *	2) The size of the second vector.
 *	3) The elements of the first vector.
 *	4) The elements of the second vector.
 *
 *
 *
 */


import java.util.Scanner;
import java.io.*;

public class project {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.println("Enter 1,1,1 for the first vector.");
	int vFirst = input.nextInt();
	double[] vfirst = new double [secondlength];
	for(int i = 0; i < vFirst; i++){
      vFirst[i] = nextInt();
	}
		
    System.out.println("Enter 1,0,1 for the second vector.");
	int vSecond = input.nextInt();
	double[] vSecond = new double [secondlength];
	for(int i = 0; i < vSecond.length; i++){
      vSecond[i] = nextInt();
	}
	
	int resultLength = (vFirst.length + vSecond.length) - 1;
	double cResult[] = convolveVectors(vFirst, vSecond);
	for(int i = 0; i < cResult; i++){
		System.out.print(cResult[i] + " ");
	}
  }
}
  
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
	int idx = 0;
	int shift =0;
	  
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
	cResult[idx] = sum (vFirst[idx - shift] * vSecond[idx]);
	
	cResult = [1 1 2 1 1];
	
	for(idx = 0; idx < cResult; idx++){
      cResult[idk] = 0;
	  for (shift =0; shift < vSecond; shift++){
	    if((idx - shift = 0 && (idx-shift < vFirst.length)){
		  vResult[idx] += vFirst[idx - shift] * vSecond[shift];
	    }
	  }
	}
	return vResult;  
}
  
	
 

  