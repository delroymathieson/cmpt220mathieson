/**
 * file: problem5_13.java
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
public class Problem5_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    int n = 0;

    while(Math.pow(n,3) < 12000){
	  n++;
    }
	
    System.out.print(n);
 }
}
	