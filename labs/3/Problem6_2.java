/**
 * file: problem6_2.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 3
 * due date: September 22, 2016
 * version: 1.8.0_102
 * 
 * This file contains the 
 * 
 */
import java.util.Scanner;
public class Problem6_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    System.out.print("Enter an integer: ");
    long integer = input.nextLong();
    System.out.print("The sum of the digits are " + sumDigits(integer));
  }
  public static int sumDigits(long n){
    int sumDigits = 0;
    int sum = (int)Math.log10(n);
	
    for(int i = 0; i <= sum; i++){
      sumDigits += (n % 10);
	  n /= 10;
  }
    return sumDigits;	
  }
 }

	