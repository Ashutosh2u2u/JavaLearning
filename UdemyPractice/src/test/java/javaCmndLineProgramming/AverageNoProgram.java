
package javaCmndLineProgramming;
public class AverageNoProgram{
public static void main(String s[])
{
 int A[]=new int[10];
 int sum=0;
 float avg=0;
 for(int i=0;i<A.length;i++)
 {
  A[i]=Integer.parseInt(s[i]);
  sum=sum+A[i];
 }
 avg=sum/A.length;
 System.out.println("The average of numbers is " +avg);
}
}