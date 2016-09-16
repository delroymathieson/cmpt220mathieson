/**
 * file: problem3_8.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file 
 * 
 */
  import java.util.Scanner;
public class problem3_8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    System.out.println(" Enter a three integer number: ");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	int v = 0;
	
	if (a > b){
	  v = a;
	  a = b;
	  b = v;
	}
	
	if (a > b){
	  v = b;
	  b = c;
	  c = v;
	}
	
	if (b > c){
		v = a;
		a = b;
		b = v;
	}
	
	System.out.println("The integers in non-decreasing order: " + a + "," + b + "," + c);
	
  }
}  
	
	
 
