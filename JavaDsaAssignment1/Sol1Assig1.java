//Program to input 2 integer variable x and y and print their product
import java.util.*;
class Sol1Assig1{
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Two no");
  System.out.println("Enter the vale of x");
  int x=sc.nextInt();
  System.out.println("Enter the value of y");
  int y=sc.nextInt();
  int product=x*y;
  System.out.println("The Product  of x and y is : -" + product);
 }
}