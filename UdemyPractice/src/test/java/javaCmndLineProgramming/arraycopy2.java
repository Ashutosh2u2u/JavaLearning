package javaCmndLineProgramming;
public class arraycopy2{
public static void main(String args[])
{ 
  int A[][]= new int[3][0];
  A[0]=new int[5];
  A[1]=new int[2];
  A[2]=new int[3];
  int count=0;
  for(int i=0;i<A.length;i++)
  {
    for(int j=0;j<A[i].length;j++)
      {
	A[i][j]=Integer.parseInt(args[count++]);
      }
   }
for(int i=0;i<A.length;i++)
  {
    for(int j=0;j<A[i].length;j++)
      {
	System.out.print(A[i][j]+ " ");
      }
   System.out.println(" ");
   }
}
}
