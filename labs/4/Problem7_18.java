/**
 * file: problem7_18.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 4
 * due date: September 29, 2016
 * version: 1.8.0_102
 * 
 * Bubble Sort
 * 
 */
 import java.util.Scanner;
public class Problem7_18{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter list: ");
   
    double[] num = new double[10];
    for (int i = 0; i < num.length; i++){
    num[i] = input.nextDouble();
  }
    bubleSort(num);

    System.out.println("The list is: ");
    for (int i = 0; i < num.length; i++){
    System.out.print(num[i]);
  }
  }

  public static void bubleSort (double[] list){
    int l = list.length -1;
    while (l != 0){
      int i;
    for(i = 0; i< l; i++){
      if(list[i] > list[i+1]){
	double a = list[i];
	list[i] = list[i+1];
    list[i+1] = a;
  }	  
}
    l = i-1;
  }
 }
}
