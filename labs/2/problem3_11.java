/**
 * file: problem3_11.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 2
 * due date: September 15, 2016
 * version: 1.8.0_102
 * 
 * This file prompts the user to enter the month and year and displays the number of days in the month.
 * 
 */
  import java.util.Scanner;
public class problem3_11 {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please Enter a Month Number: ");
	int month = input.nextInt();
	
	System.out.println("Please Enter a Year Number: ");
	int year = input.nextInt();
	
	int days = 31;
	String monthName = " ";
	
	switch(month){
	case 2:
	  days = 29;
	}
	
	switch(month){
	case 4:
	case 6:
	case 9:
	case 11:
	  days = 30;
	}
	 
	switch(month){
      case 1: monthName = ("January"); break;
		  
	  case 2: monthName = "February"; break;
		  
	  case 3: monthName = "March"; break;

	  case 4: monthName = "April"; break;

	  case 5: monthName = "May"; break;
		  
	  case 6: monthName = "June"; break;

	  case 7: monthName = "July"; break;
		  
	  case 8: monthName = "August"; break;
		  
	  case 9: monthName = "September"; break;
	 
	  case 10: monthName = "October"; break;

	  case 11: monthName = "November"; break;
		   
	  case 12: monthName = "December"; break;
	}
	
	  System.out.println(monthName + " " + year + " had " + days + " days ");
  }
}
 