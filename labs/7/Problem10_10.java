/**
 * file: Problem10_10.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 7
 * due date: October 27, 2016
 * version: 1.8.0_102
 * 
 */
public class Problem10_10{
  public static void main(String[] args){
    Queue queue = new Queue();
    for(int i = 0; i < 20; i++){
      queue.enqueue(i);
    }
    for(int i = 0; i < 20; i++){
      System.out.print(queue.dequeue());
      if ((i + 1) % 20 == 0) System.out.printf("\n");
    }
  }
}
  