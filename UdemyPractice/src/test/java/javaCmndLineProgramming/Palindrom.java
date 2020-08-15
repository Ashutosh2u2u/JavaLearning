package javaCmndLineProgramming;
public class Palindrom{
public static void main(String[] args){
   
  int a=Integer.parseInt(args[0]);         
  //Program to check palindrome 
  int sum=0;
  int r=0;
  int t=a;
  
  while(a>0)
  {
    r=a%10;
    sum=(sum*10)+r;
    a=a/10;
  }
  
  if(sum==t)
    {System.out.println("The " +t+ " number is palindrome");
     }   
    else
      {System.out.println("The " +t+ " number is not palindrome");
      }
}
}