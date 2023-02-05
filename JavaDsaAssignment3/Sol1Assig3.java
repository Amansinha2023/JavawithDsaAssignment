/*Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
is taken with 5 and then multiply the resultant value by 5. Display the final result.*/

import java.util.*;
public class Sol1Assig3{
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no x");
  int x=sc.nextInt();
  double quotient=(x+8)/3;
  double modulus =quotient%5;
  double result=modulus*5;
  System.out.println("The result is :- " + result);
  // double result =((((x+8)/3)%5)*5);
  // System.out.println("result is :- " + result);
 }
}