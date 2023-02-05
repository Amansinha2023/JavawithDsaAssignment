//Program to input no of times the user wants the sume of two different no according user wish

import java.util.*;



public class Sol4Assig2 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no of times you want to print the sum of two number");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++){
   
   System.out.println("Ener first no for "+ i +"time");
   int num1=sc.nextInt();
   System.out.println("Enter 2nd no" + i + "time");
   int num2=sc.nextInt();
   System.out.println(num1+num2);
  }
 }
 
}
