//Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
import java.util.*;
public class Sol3Assig3 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter three digit no");
  int n=sc.nextInt();
  int lastdigit=n%10;
  n/=10;
  int secondigit=n%10;
  n/=10;
  int firstdigit=n%10;
  int sum=lastdigit+secondigit+firstdigit;
  System.out.println("The sum of three digit is = "+ sum);
  

 }
}
