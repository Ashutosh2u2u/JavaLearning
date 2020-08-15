
package javaObject;
class A
{

	int x;
	static int count=0;   
	A(int x)
	{
		this.x=x;
		count++;
	}
	void show()
	{
		System.out.println("Value is " +x);
		System.out.println("Objects count is" +count);     
	}
}
class ADemo
{
	public static void main(String s[])
	{
		A a1=new A(10);
		a1.show();
		a1.x=200;
		A.count++;
		A a2=new A(25);
		a2.show();
		a1.show();
	}
}