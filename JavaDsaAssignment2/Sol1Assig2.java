//Program to input name,Roll NO & Field of interest from the user and print in the given format

import java.util.*;
class Sol1Assig2{
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enetr your Name");
  String name=sc.nextLine();
  System.out.println("Enter you roll No");
  int roll= sc.nextInt();
  System.out.println("Enter Your field of Interest");
  String interest=sc.next();
  System.out.println("Name :"+ name );
  System.out.println("Roll :"+ roll);
  System.out.println("Interest :" + interest);
 }
}