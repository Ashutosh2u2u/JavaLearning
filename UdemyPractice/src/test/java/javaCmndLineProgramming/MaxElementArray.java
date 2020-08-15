package javaCmndLineProgramming;

//Program by command line argument
//To run such program---Run--run as---configuration---argument tab---pass arugument ,separated by spaces
//Run as java application gives error-ArrayIndexoutofbound

public class MaxElementArray
{
	public static void main(String s[])
	{
		int A[]=new int[10];
		//A[]= {};
		for(int i=0;i<A.length;i++)
		{
			A[i]=Integer.parseInt(s[i]);
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
