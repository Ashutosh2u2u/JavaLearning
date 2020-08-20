package patternProblems;
/*
1	1	1	1	
2	2	2	
3	3	
4	

 */
public class Pattern4 {

	public static void main(String[] args)
	{
		
    for(int i=1;i<5;i++)
    {
    	for(int j=1;j<=5-i;j++)
    	{
    		System.out.print(i);
    		System.out.print("\t");
    		
    	}
    	System.out.println("");
    }

	}

}
