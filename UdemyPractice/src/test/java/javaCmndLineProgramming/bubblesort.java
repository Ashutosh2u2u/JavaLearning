package javaCmndLineProgramming;
public class bubblesort{
public static void main(String args[])
{
  int A[]=new int[5];
  int c=0;
  int temp=0;
  for(int i=0;i<A.length;i++)
  {
   A[i]=Integer.parseInt(args[i]);
  }

  for(int i=0;i<A.length;i++)
  {
    for(int j=0;j<(A.length-1);j++)
    {
      if(A[j]>A[j+1])
      {temp=A[j];
       A[j]=A[j+1];
       A[j+1]=temp;
      }   
    }
   temp=0;
  }
 
 System.out.println("The sorted array is :");
for(int i=0;i<A.length;i++)
{
 System.out.print(A[i]+" ");
}
}
}
   