/**
 * file: Problem7_31.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: Lab 7
 * due date: October 6, 2016
 * version: 1.8.0_102
 * 
 */
 import java.math.BigDecimal;
public class Problem10_17{
  public static void main(String[] args) {
    
  BigDecimal bigNum = new BigDecimal(Math.round(Math.sqrt(Long.MAX_VALUE)));
  
  System.out.println("The Square Root of Long MAX VALUE: " + Math.sqrt(Long.MAX_VALUE) 
  + "\nLong.MAX_VALUE:" + Long.MAX_VALUE);
  
for(int i = 1; i < 10; i++){
	System.out.println(bigNum.multiply(bigNum));
	bigNum = bigNum.add(BigDecimal.ONE);
    }
  }
}

