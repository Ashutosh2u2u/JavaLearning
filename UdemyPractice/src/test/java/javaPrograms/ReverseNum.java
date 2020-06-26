package javaPrograms;

public class ReverseNum {

	public static void main(String[] args)
	{
		int a=1234;
		int rev=0;
		while(a!=0)
		{
			int rem=a%10; //for getting unit place
			rev=rem+(rev*10); //for getting number 
			a=a/10;  //for returning remaing number after removing reminder
		}
    System.out.println(rev);
	}

}
