package javaPrograms;

public class SumOfelements {

	//Create a Method which accepts Array and return sum of all the elements in array
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		int sum =SumOfElement(a);
		System.out.println(sum);
	}

	public static int SumOfElement(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum +a[i];
		}
		return sum;		
	}
}
