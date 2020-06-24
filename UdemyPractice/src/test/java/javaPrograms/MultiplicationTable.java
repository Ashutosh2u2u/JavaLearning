package javaPrograms;

public class MultiplicationTable {
//Print 5 multiplication table without using multiply operator
	public static void main(String[] args) {
		
		int result=Multiplic(5,10);
		System.out.println(result+ "multiplication result");
	}

public static int Multiplic(int i, int j)
{
   //we have to add i upto j times to get result
	int k=0;
	int sum=0;
	for(k=0;k<j;k++)
	{
		sum=sum+ i;
		System.out.println(sum);
	}
	return sum;
}

	
}
