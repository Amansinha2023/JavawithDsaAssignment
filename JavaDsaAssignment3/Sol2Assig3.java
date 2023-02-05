//Q2 - Swap two numbers without the use of third variable.

import java.util.*;
public class Sol2Assig3 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number");
  int num1=sc.nextInt();
  System.out.println("Enter second number");
  int num2=sc.nextInt();
  num1=num1+num2;
  num2=num1-num2;
  num1=num1-num2;
  System.out.println("The swapped no are:- "+ num1 + num2);
 }
}
