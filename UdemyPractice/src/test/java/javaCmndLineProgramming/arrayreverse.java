package javaCmndLineProgramming;
public class arrayreverse{
public static void main(String args[])
{
  int [][]A=new int[2][2];
  int c=0;
  for(int i=0;i<A.length;i++)
  {
    for(int j=0;j<A[i].length;j++)
    {
      A[i][j]=Integer.parseInt(args[c]);
      c++;
    }
  }
  System.out.println("The given array is : ");
  for(int i=0;i<A.length;i++)
  {
    for(int j=0;j<A[i].length;j++)
    {
      System.out.print(A[i][j]);
      
    }
   System.out.println(" ");
  }
  System.out.println("The reverse of the array is :");
  for(int i=A.length-1;i>=0;i--)
  {
    for(int j=A[i].length-1;j>=0;j--)
    {System.out.print(A[i][j]);
    }
   System.out.println(" ");
  }
}
}