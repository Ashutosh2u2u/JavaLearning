package javaPrograms;

public class ReverseString {

	public static void main(String[] args)
	{
		String s="Ashutosh";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s==rev)
		{
			System.out.println("Given string is pallindrom");
		}
		else
		{
			System.out.println("Given string is not a pallindrom");
				
		}
	}

}
