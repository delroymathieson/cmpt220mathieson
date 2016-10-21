/**
 * file: problem9_1.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 6
 * due date: October 20, 2016
 * version: 1.8.0_102
 * 
 */
 
 public class Problem9_1{
  public static void main(String[] args){
    
    RectangleClass[] rectangle = new RectangleClass[2];
    rectangle[0] = new RectangleClass(4,40);
    rectangle[1] = new RectangleClass(3.5,35.9);
	
    for (int i = 0; i < 2; i++){
      System.out.println("Rectangle" + (i+1) + ":"  + "\n");
	  System.out.printf("Area = " + "%.2f", rectangle[i].getArea());
	  System.out.println("\n" + "Perimeter = " + rectangle[i].getPerimeter() + "\n");
	
    }	
  }
}
  
