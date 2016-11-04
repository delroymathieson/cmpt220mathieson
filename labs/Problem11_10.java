import java.util.Scanner;
public class Problem11_10 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Problem11_10x stack = new Problem11_10x();
    System.out.println("Enter five strings: ");
    for(int i = 0; i < 5; i++)
    stack.push(input.next());
    
	System.out.println("The string you entered in reverse order: ");
    while(stack.size() > 0){
      System.out.println(stack.pop());
    }
  }
}