//Q2 - Swap two numbers without the use of third variable.
import java.util.*;


public class Sol2Assig3 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two number to be swapped");
  int a=sc.nextInt();
  int b=sc.nextInt();
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("Swapped values is:- "+ a +"  " + b);
 }
}
