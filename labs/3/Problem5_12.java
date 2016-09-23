/**
 * file: problem5_12.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 3
 * due date: September 21, 2016
 * version: 1.8.0_102
 * 
 * 
 * 
 */

import java.util.Scanner;
public class Problem5_12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int n = 0;
	
    while(Math.pow(n,2) < 12000){
      n++;
    }
	
    System.out.print(n);
 }
}
	