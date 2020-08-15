package javaCmndLineProgramming;


public class MaxEleCount
{
	public static void main(String[] s)
	{
		//String s[]= {"123","5","111","5","34","123"};
		int A[]=new int[10];
		for(int i=0;i<A.length;i++)
		{
			//string to integer array
			A[i]=Integer.parseInt(s[i]);
		}
		int max=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
		}
		int c=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==max)
			{
				c++;
			}
		}
		System.out.println("The element with maximum value is " +max+ " coming " +c+ " times in an array");
	}
} 