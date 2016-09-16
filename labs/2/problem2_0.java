/**
 * file: problem2_0.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file calculates grade percentage
 */
 import java.util.Scanner;
public class problem2_0 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
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
	
	if(finalGrade<=59){
		System.out.println("Your final grade is: F ");
	}
	
	else if(finalGrade<=66){
		System.out.println("Your final grade is: D ");
	}
	
	else if(finalGrade<=69){
		System.out.println("Your final grade is: D+ ");
	}
	
	else if(finalGrade<=72){
		System.out.println("Your final grade is: C- ");
	}
	
	else if(finalGrade<=76){
		System.out.println("Your final grade is: C ");
	}
	
	else if(finalGrade<=79){
		System.out.println("Your final grade is: C+ ");
	}
	
	else if(finalGrade<=82){
		System.out.println("Your final grade is: B- ");
	}
	
	else if(finalGrade<=86){
		System.out.println("Your final grade is: B ");
	}
	
	else if(finalGrade<=89){
		System.out.println("Your final grade is: B+ ");
	}
	
	else if(finalGrade<=94){
		System.out.println("Your final grade is: A- ");
	}
	
	else if(finalGrade>=95){
		System.out.println("Your final grade is: A ");
	}
  }
}