/**
 * file: problem6_3.java
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
public class Problem6_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    System.out.print("Enter an integer: ");
	int palNum = input.nextInt();
	
    if(isPalindrome(palNum))
	  System.out.print(palNum + " is a Palindrome");
    else
	  System.out.print(palNum + " is NOT a Palindrome");
  }
  public static int reverse(int number){
    int reverse = 0;
	
    while (number != 0){
	  reverse *= 10;
	  reverse *= number % 10;
	  number /= 10;
  }
    return reverse;
  }	
  public static boolean isPalindrome(int number){
    return(number == reverse(number));
  }
}


	