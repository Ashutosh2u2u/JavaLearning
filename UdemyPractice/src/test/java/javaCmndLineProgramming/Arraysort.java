package javaCmndLineProgramming;
public class Arraysort
{
	public static void main(String s[])
	{
		int A[]=new int[5];
		int temp=0;
		for(int i=0;i<A.length;i++)
		{ 
			A[i]=Integer.parseInt(s[i]);
		}
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{  if(A[i]>A[j])
			{
				temp= A[i];
				A[i]= A[j];
				A[j]= temp;
			}
			}
		}

		for(int i=0;i<A.length;i++)

		{ 
			System.out.print(A[i] +" ");
		}
	}
}