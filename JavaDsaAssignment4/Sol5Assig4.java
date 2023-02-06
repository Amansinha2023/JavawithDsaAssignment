//Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
//      and division.


import java.util.*;


public class Sol5Assig4 {
 public static void main(String[] args) {
  System.out.println("Enter any two number");
  Scanner sc=new Scanner(System.in);
  int num1=sc.nextInt();
  int num2=sc.nextInt();
  System.out.println("Enter you choice to +,/,-,* by pressing the symobol from the keyboard to pefrom the follownig action");
  char ch=sc.next().charAt(0);
  switch (ch){
  case '+':System.out.println(num1+num2);break;
  case '/':System.out.println(num1/num2);break;
  case '-':System.out.println(num1-num2);break;
  case '*':System.out.println(num1*num2);break;
  default:System.out.println("wrong choice ");
  }
   
 }
}
