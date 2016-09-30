/**
 * file: problem6_8.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: LAB 4
 * due date: September 29, 2016
 * version: 1.8.0_102
 * 
 * Converts Cel to Far.
 * 
 */
public class Problem6_8{
  public static void main(String[] args){
	 
    System.out.printf("Celsius   Farenheit   |    Farenheit     Celsius");	 
    for (double cel=40.0, far=120; cel>30.0; cel-=1, far-=10){
    double[] myList = new double[100];
    System.out.printf("%10.1f %10.1f  |  %10.1f %10.1f \n", 
	  cel, Cel2Far(cel), far, Far2Cel(far));
   }
}
  
   public static double Cel2Far(double cel){
     return (9.0)/5.0 * (cel + 32.0);
   }
	
   public static double Far2Cel(double far){
     return (5.0/9.0) * (far - 32.0);
   }
}
