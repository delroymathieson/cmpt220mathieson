/**
 * file: Problem7_31.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: Lab 5 
 * due date: October 6, 2016
 * version: 1.8.0_102
 * 
 */
import java.util.Scanner;
public class Problem7_31{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
	
  System.out.println("Enter the numbers for the first list: ");
    int[] firstList = new int[input.nextInt()];	
    for (int i = 0; i < firstList.length; i++){
      firstList[i] = input.nextInt();
  }
	
  System.out.println("Enter the numbers for the second list: ");
    int[] secondList = new int[input.nextInt()];
    for (int i = 0; i < secondList.length; i++){
      secondList[i] = input.nextInt();
  }
	
  int[] thirdList = merge(firstList, secondList);
  System.out.print("The merged list is: ");
  for(int i = 0; i < thirdList.length; i++){
    System.out.print(thirdList[i] + " ");
  }
}

public static int[] merge(int[] firstList, int[] secondList) {
  int[] thirdList = new int [firstList.length + secondList.length];
  int p = 0, q = 0;
  for (int i = 0; i < thirdList.length; i++){
    if (p < secondList.length && firstList[q] > secondList[p]){
	  thirdList[i] = secondList[p];
	  p++;
    }
	else if (q < firstList.length){
      thirdList[i] = firstList[q];
      q++;	
  }
}
  return thirdList;	
  }
}

