/**
 * file: problem2.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 1
 * due date: September 7, 2016
 * version: 1.8.0_102
 * 
 * This file calculates grade percentage
 */
// == incorrect indentation
 import java.util.Scanner;
public class problem2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    // == you are using tabs!!!
	System.out.println(" Please enter the following as a percentage.... ");
	
	System.out.println(" Midterm Exam: ");
	double midterm = input.nextInt();
	
	System.out.println(" Final Exam: ");
	double finalExam = input.nextInt();
	
	System.out.println(" Projects: ");
	double projects = input.nextInt();
	
	System.out.println(" Homework and Labs: ");
	double hw = input.nextInt();
	
	double finalGrade = ((midterm * 0.2) + (finalExam * 0.2) + (projects * 0.2) + (hw * 0.4));

	System.out.println(" Your final grade is: " + finalGrade + "%");
  }
}
