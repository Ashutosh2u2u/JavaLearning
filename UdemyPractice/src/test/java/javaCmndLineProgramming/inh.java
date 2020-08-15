package javaCmndLineProgramming;

class Aa
{
	int x;
	Aa(int x)
	{
		this.x=x;
	}
}

class B extends Aa{
	int area;
	B()
	{
		super(5);
	}

	void areac()
	{
		area=x*x;
	}
	void display()
	{
		System.out.println("The Area of a Square is : "+area);
	}
}

class inh
{
	public static void main(String s[]){
		B b=new B();
		b.areac();
		b.display();
	}
}
