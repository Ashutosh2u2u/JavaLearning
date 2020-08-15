package javaCmndLineProgramming;
public class greatest
{
public static void main(String args[])
{
  int [][]A=new int[3][3];
  int c=0;
  int k=args.length;
if(k==9)  
{  
	for(int i=0;i<A.length;i++)
  {
    for(int j=0;j<A[i].length;j++)
     {
       A[i][j]=Integer.parseInt(args[c++]);
     }
  }
  int max=A[0][0];
  System.out.println("The given array is : ");
  for(int i=0;i<A.length;i++)
  {
    for(int j=0;j<A[i].length;j++)
     {
        System.out.print(A[i][j]);
       if(A[i][j]>max)
        max=A[i][j];
      }
   System.out.println(" ");
  }
   System.out.println("The biggest number in the given array is" +max);
}
else
 System.out.println("Please enter 9 digit numbers");
}
}