/**
 * file: Problem18_1.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 10
 * due date: November 16, 2016
 * version: 1.8.0_102
 * 
 */
import java.util.Scanner;
public class Problem18_1{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a number: ");
  int num = input.nextInt();
  System.out.print(num + "! is " + factor(num));
  input.close();
  }
  public static int factor(int num){
    if (num <= 1)
    return 1;
    return (num * factor(num - 1));
  }
}

