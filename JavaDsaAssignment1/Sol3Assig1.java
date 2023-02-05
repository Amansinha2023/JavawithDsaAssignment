//Program to take length and breath an Print area of rectangle


import java.util.*;
public class Sol3Assig1 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the length of rectangle");
  int length = sc.nextInt();
  System.out.println("Enter the breath of Recantgle");
  int breath = sc.nextInt();
  int area= length*breath;
  System.out.println("The  Area Of Rectangle is:-  " + area);
 }
}
