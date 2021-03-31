package patternProblems;

public class Spclpattern {
/* ['1','2','3','4']
 * ['5','6','1','2']
 * ['3','4','5','6']
 * ['1','2','3','4']
 * ['5','6','1','2']
 * ['3','4','5','6']
 * ['1','2','3','4']
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			
		    for(int i=1;i<6;i++)
		    {
		    	System.out.print("[");
		    	for(int j=1;j<=4;j++)
		    	{
		    		System.out.print("'"+j+"'");
		    		System.out.print(",");
		    		//System.out.print("\t");
		    		
		    		
		    	}
		    	System.out.print("]");
		    	System.out.println("");
		    	
		    }

			}

	}

}
