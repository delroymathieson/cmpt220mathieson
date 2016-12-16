/**
 * file: Problem10_2.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: BMI
 * due date: October 27, 2016
 * version: 1.8.0_102
 * 
 */
public class Problem10_2{
  public static void main(String[] args){
    BMI b = new BMI("Delroy", 19, 135, 5, 10);
    System.out.printf("Name: %s Age: %d Weight: %.2f Feet: %.2f Inches: %.2f\n",
	                   b.getName(), b.getAge(), b.getWeight(), b.getFeet(), b.getInches());
  }
}