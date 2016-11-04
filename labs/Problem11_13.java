import java.util.*;
public class Problem11_13{
public static void main(String[] args){
  
  ArrayList<Integer> list = new ArrayList<Integer>(); 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter ten integers: ");
  int[] input = new int [10];
    for (int i = 0; i < 10; i++){
      input[i] = in.nextInt();
	  list.add(input[i]);
	}  
	  in.close();
      removeDuplicate(list);
      System.out.print("The distant integers are: ");
    for (int i = 0; i < list.size(); i++){
	  System.out.print(list.get(i) + " ");
  }
}

public static void removeDuplicate(ArrayList<Integer> list){
  for (int i = 0; i < list.size(); i++){
    Integer first = list.get(i);
    List sublist = list.subList(i + 1, list.size());
  while (sublist.contains(first)){
    sublist.remove(first);
      }
    } 
  }
}