package javaPrograms;

public class CountOccurance {

	public static void main(String[] args)
	{
		int count=countOccur("aawaajkroaasmaanse",'a');
		System.out.println(" character a occur " +count+ " times in word");
	}

	public static int countOccur(String word, char character)
	{
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==character)
			{
				count++;
			}
		}

		return count;
	}

}
