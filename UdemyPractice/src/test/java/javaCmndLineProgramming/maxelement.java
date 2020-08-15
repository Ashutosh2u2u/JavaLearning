package javaCmndLineProgramming;
public class maxelement{
public static void main(String s[])
{
 int A[]=new int[25];
 for(int i=0;i<A.length;i++)
 {A[i]=Integer.parseInt(s[i]);
 }
 int max=0;
 for(int i=0;i<A.length;i++)
 {if(A[i]>max)
   {
    max=A[i];
   }
 }
System.out.println("The maximum element of the array : " +max);
}
}
