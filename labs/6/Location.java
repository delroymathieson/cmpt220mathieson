/**
 * file: problem9_13.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 6
 * due date: October 20, 2016
 * version: 1.8.0_102
 * 
 */
 public class Location{
  public int row;
  public int column;
  public double maxValue;
  
  public Location(int row, int column, double maxValue){
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
  }
  
  public static Location locateLargest(double[][] a){
    int row = 0;
    int column = 0;
    double maxValue = a[row][column];
	
	for(int i = 0; i < a.length; i++){
      for (int k = 0; k < a[i].length; k++){
	    if(maxValue < a[i][k]){
		  maxValue = a[i][k];
		  row = i;
		  column = k;
		}
	  }
	}
    return new Location(row, column, maxValue);
  }
}