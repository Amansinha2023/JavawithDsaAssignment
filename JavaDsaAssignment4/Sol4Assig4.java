//Q4 - Write a program to print positive number entered by the user, if user enters a negative
//     number, it is skipped

import java.util.*;


public class Sol4Assig4 {
 public static void main(String[] args) {
  System.out.println("Enter any number");
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  if(num<0){
  
   System.out.println("Number is negative so skipped");
  }
   else{
   System.out.println(num);
   }
 }
}