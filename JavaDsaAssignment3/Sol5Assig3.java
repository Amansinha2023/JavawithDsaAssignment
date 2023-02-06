//Q5 - Find the total number of bits needed to be flipped to convert x to y.


import java.util.*;
public class Sol5Assig3 {
 public static void main(String[] args) {
  int count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of X:-");
  int x=sc.nextInt();
  System.out.println("Enter the value of Y");
  int y=sc.nextInt();
  if(x<y){
   while(x<y){
   x=x<<1;
   count++;
   if(x==y){
    
    break;
   }
   }
  }
  else{
   while(x>y){
    x=x>>1;
    count++;
    if(x==y){
     
     break;
     
    }
   }
  }
  System.out.println("The no of bits ot be shifted is "+count);
 }
 
}
