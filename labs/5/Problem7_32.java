/**
 * file: Problem7_32.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: Lab 5 
 * due date: October 6, 2016
 * version: 1.8.0_102
 * 
 */
import java.util.Scanner;
public class Problem7_32{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
	
  System.out.println("Enter list: ");
  int[] firstList = new int[input.nextInt()];	
  for (int i = 0; i < firstList.length; i++){
    firstList[i] = input.nextInt();
  }
  partition(firstList);
  System.out.println("After the partition, the list is ");
  for(int i = 0; i < firstList.length; i++){
    System.out.print(firstList[i] + " ");
  }
}


public static int partition(int[] list){
  int partition = list[0];
  int partitionLocation = 0;
  int hi = list.length - 1;
  
  while (partitionLocation < hi){
  if (partition > list[partitionLocation + 1]){
	  list [partitionLocation] = list[partitionLocation + 1];
	  list [partitionLocation + 1] = partition;
	  partitionLocation++;
  } 
  else{
    int temp = list[hi];
	list[hi] = list[partitionLocation + 1];
    list[partitionLocation + 1] = temp;
    hi--;
  }
 }
 return partitionLocation;
  }
}


