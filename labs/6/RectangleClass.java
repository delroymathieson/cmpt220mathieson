/**
 * file: problem9_1.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 6
 * due date: October 20, 2016
 * version: 1.8.0_102
 * 
 */



public class RectangleClass{
  private double height;
  private double width;
  
  public RectangleClass(){
    this.height = 1.0;
	this.width = 1.0;
  }
  
  public RectangleClass(double height, double width){
    this.height = height;
	this.width = width;
  }
  
  public double getArea(){
    return this.height * this.width;
  }
  
  public double getPerimeter(){
    return this.height * 2 + this.width * 2;
  }
}

