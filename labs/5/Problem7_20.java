/**
 * file: Problem7_20.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 5 
 * due date: October 6, 2016
 * version: 1.8.0_102
 * 
 */
import java.util.Scanner;
public class Problem7_20{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] sort = new int[10];
	
	System.out.println("Enter ten digits: ");
	
	for (int i = 0; i < sort.length; i++){
		sort[i] = input.nextInt();
	}
	
	System.out.println("The sorted digits are: ");
	
	selectionSort(sort);
	for (int i = 0; i < sort.length; i++){
	  System.out.print(sort[i] + " ");
  }
}

	
	
public static void selectionSort(int[] list){
  for (int i = list.length - 1; i > 0; i--) {

  int currentMax = list[i];
  int currentMaxIndex = i;

  for (int j = 0; j < i; j++) {
  if (currentMax < list[j]) {
    currentMax = list[j];
    currentMaxIndex = j;
  }
}

  if (currentMaxIndex != i) {
   list[currentMaxIndex] = list[i];
   list[i] = currentMax;
      }
    }
  }
}