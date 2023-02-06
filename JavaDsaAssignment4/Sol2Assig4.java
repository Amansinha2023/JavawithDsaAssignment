//Q2 - Write a program to print absolute value of a number entered by the user.
import java.util.*;


public class Sol2Assig4 {
 public static void main(String[] args) {
  System.out.println("Enter any number to print its absolute value");
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  if(num<0){
   num=~(num+1);
   System.out.println(num);
  }
 
   System.out.println(num);
  
 }
}
