/**
 * file: problem7_9.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 4
 * due date: September 29, 2016
 * version: 1.8.0_102
 * 
 * Sorts Numbers.
 * 
 */
import java.util.Scanner;
public class Problem7_9{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter list: ");
    double[] num = new double[10];
	  
    for (int i = 0; i < num.length; i++){
	  num[i] = input.nextDouble();
  }
    input.close();
    System.out.println("The minimum number is: " + min(num));
  }

   public static double min(double[] array){
     double min = array[0];
	  
     for (int i = 0; i < array.length; i++){
	   if(min > array[i]) min = array[i];
  } 
  return min;
  }
}