/**
 *
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: Project 2
 * due date: 2016
 * version: 1.0
 * 
 * Binary to text converter
 * 
 */

import java.util.Scanner;
public class binaryConverter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String str = input.next();
    byte[] word = str.getBytes();

    StringBuffer buffer = new StringBuffer();
	
	for (byte byt : word){
	  int value = byt;
	  for (int i = 0; i < 8; i++){
	    if((value & 128)==0){	 
		  buffer.append(0);
	    }
	    else{
   	      buffer.append(1);
	    }
      value = value << 1;
	  }
      buffer.append(' '); 
	}
	  System.out.println(str + " in binary code is: " + buffer);
   }
}