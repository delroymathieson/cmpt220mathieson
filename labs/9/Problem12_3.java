/**
 * file: Problem12_3.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 9 
 * due date: November 10, 2016
 * version: 1.8.0_102
 * 
 */
import java.util.Scanner;
import java.util.*;
public class Problem12_3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final int size = 100;
   
    int[] array = new int[size];
    for(int i = 0; i < size; i++){
	  array[i] = 1 + (int)(Math.random() * 100);
	}
    
    System.out.println("Enter the index of the array: ");
    int index = input.nextInt();
	
    try{
      int value = array[index];
	  System.out.println("The corresponding element value: " + value);
    }
	catch(ArrayIndexOutOfBoundsException ex){
      System.out.println("Out of Bounds");
    }
  }
}










