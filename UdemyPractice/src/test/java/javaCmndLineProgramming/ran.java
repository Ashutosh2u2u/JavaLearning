package javaCmndLineProgramming;
class RandomHelper
{
	static int x,y;
	static int randint(int a,int b)
	{
		x=a;
		y=b;
		return((int)(Math.random()*(y-x)+x));
	}

	static double randdouble(int a, int b)
	{
		x=a;
		y=b;
		return((double)(Math.random()*((y-1)-x)+x)); 
	}
}

class ran
{
	public static void main(String args[])
	{
		int a=RandomHelper.randint(1,10);
		System.out.println(a);
		double b=RandomHelper.randdouble(1,10);
		System.out.println(b);
	}
}                        