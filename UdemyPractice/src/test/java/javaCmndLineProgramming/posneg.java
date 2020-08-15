package javaCmndLineProgramming;
public class posneg
{
public static void main(String args[])
{
 
 
 int b=args.length;
 
 if(b!=0)
 {int a=Integer.parseInt(args[0]);
   if(a!=0)
   {
     if(a>0)
      {  
        System.out.println(a+ "is a positive number");
      }
     else
      {
        System.out.println(a+ "is a negative number");
      }
   }
   else
   {
     System.out.println(a+ "is neither negative nor positive");
   }
 }
 else
 {System.out.println(b+ "Elements are present in an array of string");
 }
}
}