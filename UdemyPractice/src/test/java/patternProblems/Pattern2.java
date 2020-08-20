package patternProblems;
/*
1	2	3	4	
1	2	3	
1	2	
1	

 */
public class Pattern2 {

	public static void main(String[] args)
	{
		//int k=1;
    for(int i=1;i<5;i++)
    {
    	for(int j=1;j<=5-i;j++)
    	{
    		System.out.print(j);
    		System.out.print("\t");
    		//k++;
    	}
    	System.out.println("");
    }

	}

}
