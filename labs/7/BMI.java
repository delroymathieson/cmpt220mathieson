/**
 * file: Problem10_2.java
 * author: Delroy Mathieson
 * course: CMPT 220
 * assignment: BMI
 * due date: October 27, 2016
 * version: 1.8.0_102
 * 
 */
public class BMI{
  private String name;
  private int age;
  private double weight;
  private double height;
  private double feet;
  private double inches;

  public BMI(String name, int age, double weight, double feet, 
  double inches){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
    this.feet = feet;
    this.inches = inches;
}

  public double getBMI(){
  double BMI = (weight * 0.45) + (height * 0.025) 
  + (weight * 0.45)/(Math.sqrt(height * 0.025));
  return BMI;
}

  public String getName(){
    return name;
}

  public int getAge(){
    return age;
}


  public double getWeight(){
    return weight;
}

  public double getHeight(){
    return height;
}

  public double getInches(){
    return inches;
}

  public double getFeet(){
    return feet;
  }
}

