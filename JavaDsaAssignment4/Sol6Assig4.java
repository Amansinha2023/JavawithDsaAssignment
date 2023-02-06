//Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :



import java.util.*;


public class Sol6Assig4 {
 public static void main(String[] args) {
  System.out.println("Enter  number");
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  
  if(num>=90)
  {
  System.out.print("Your Grade is A+");
  }else if(num>=80)
  {
  System.out.print("Your Grade is A");
  }else if(num>=70)
  {
  System.out.print("Your Grade is B+");
  }else if(num>=60)
  {
  System.out.print("Your Grade is B");
  }else if(num>=50)
  {
  System.out.print("Your Grade is C");
  }else if(num>=40)
  {
  System.out.print("Your Grade is D");
  }else if(num>=30)
  {
  System.out.print("Your Grade is E");
  }else if(num<30){
  System.out.print("Your Grade is f");
  }else{
  System.out.print("Enter valid marks");
  }
   
 }
}
