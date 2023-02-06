//Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
//     calculate Profit or Loss.
 import java.util.*;
 class Sol3Assig4{
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter cost price and Sell Price simultenously");
   int cp=sc.nextInt();
   int sp=sc.nextInt();
   if(cp<sp){
    int profit=sp-cp;
    System.out.println("Profit is:-  "+ profit);
   }
   else{
    int loss = cp-sp;
    System.out.println("Loss is :-   "+ loss);
   }
  }
 }

