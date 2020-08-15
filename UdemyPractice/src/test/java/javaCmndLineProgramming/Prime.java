package javaCmndLineProgramming;
public class Prime{
public static void main(String args[])
{
 
 int n=Integer.parseInt(args[0]);
 int i=2;
 int c=0;
 

if(n!=0&&n!=1)
{while(i<n)
{  if(n%i==0)
   {
      System.out.println(n+ " is not a prime number ");
     c++;
    break;
   }
  else
   i++;
}
if(c==0)

  
      System.out.println(n+ " is a  prime number ");
}
else
 System.out.println(n+ " is neither prime nor composite"); 
}
}