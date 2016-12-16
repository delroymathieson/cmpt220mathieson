/**
 * file: Problem10_10.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 7 
 * due date: October 27, 2016
 * version: 1.8.0_102
 * 
 */
 public class Queue{
   private int[] elements; 
   private int size;
   private int capacity;
   
   public Queue(int capacity){
     this.capacity = capacity;
     elements = new int [capacity];
   }
   
   public Queue(){
     this(8);
   }
  
   public void enqueue(int value){
     if (size >= elements.length){
       int[] temp = new int [elements.length * 2];
	   elements = temp;
     }
   elements[size++] = value;
   }
   public int dequeue(){
     int value = elements[0];
     size--;
     for (int i = 0; i < size; i++){
	   elements[i] = elements [i+1];
    }
   return value;
   }
   
   public boolean isEmpty(){
     return size == 0;
   }
   
   public int getSize(){
     return size;
   }
   
   public int getCapacity(){
     return capacity;
   }
}