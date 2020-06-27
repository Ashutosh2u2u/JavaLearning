package javaPrograms;

public class FactorialDemo {
	static int fact = 1;
	public static void main(String[] args)
	{
		int factor=fact(5);
		System.out.println(factor);
	}

	public static int fact(int n) 
	{		
		if(n>=1) //for positive no only
		{
		fact=n*fact;
		fact(n-1);//every time n value reduce by 1
		}
		return fact;
	}

}
