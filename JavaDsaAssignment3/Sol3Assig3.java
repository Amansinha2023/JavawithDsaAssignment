//Q3 - Write a program to calculate the sum of the digits of a 3-digit number.

import java.util.*;
public class Sol3Assig3 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a three digit no");
  int n=sc.nextInt();
  int firstdigit=n/100;
  int secondigit=(n/10)-firstdigit*10;
  int thriddigit=(n/1)-((firstdigit*100+secondigit*10));
  int sum=firstdigit+secondigit+thriddigit;
  System.out.println("The sum of the three digit is:- " + sum);
 }
}
