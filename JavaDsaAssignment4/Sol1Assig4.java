//Q1 - Write a program which takes the values of length and breadth from user and check if it is
//     a square or not.
import java.util.*;
class Sol1Assig4{
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the lenght and Breath respecitvely");
  int l=sc.nextInt();
  int b=sc.nextInt();
  if(l==b){
   System.out.println("This is square");
  }
  else{
   System.out.println("It is a rectangle");
  }
 }
}