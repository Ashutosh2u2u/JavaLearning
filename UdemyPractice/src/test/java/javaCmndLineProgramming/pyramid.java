package javaCmndLineProgramming;
public class pyramid{
	public static void main(String s[])
	{
		int n=1;
		int noe=Integer.parseInt(s[0]);

		for(int i=0;i<noe;i++)
		{
			for(int j=0;j<noe-(i+1);j++)
			{
				System.out.print(" ");
			}

			for(int k=0;k<=i;k++)
			{
				if(n==10)
				{
					System.out.print("0");
					n=1;
				}
				else
				{
					System.out.print(n+"");
					n++;   
				}
			}
			int p=n-1;
			for(int r=0;r<i;r++)
			{ p=p-1;
			if(p!=0)
			{
				System.out.print(p+"");
			}
			else
			{ System.out.print(p+"");
			p=10;

			}
			}

			System.out.println(" ");
		}
	}
}