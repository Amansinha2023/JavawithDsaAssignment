//Program to marsk of three subject out of hunderd and find the total and percentage
import java.util.*;
public class Sol3Assig2 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the marks of First subject");
  int marks1=sc.nextInt();
  System.out.println("Enter the marsk of Second Subject");
  int marks2=sc.nextInt();
  System.out.println("Enter the marsk of Third subject");
  int marks3=sc.nextInt();
  
  int total=marks1+marks2+marks3;
  System.out.println("The total marks out of 300 is :- "+total+"/300");

  int percentage=total/3;
  System.out.println("The percentage you got is:-" + percentage + "%");
 }
}
