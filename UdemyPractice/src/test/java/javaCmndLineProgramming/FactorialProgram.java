
package javaCmndLineProgramming;
public class FactorialProgram
{
public static void main(String s[])
{
 int n=Integer.parseInt(s[0]);
 int fact=1;
 for(int i=1;i<=n;i++)
 {
   fact=fact*i;
 }
System.out.println("The Factorial of " +n+ " is " +fact);
}
}