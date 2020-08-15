package javaObject;

class XYDetails
{
	int x,y;
	void setXY(int xval, int yval)
	{
		x=xval;
		y=yval;
	}
	void display()
	{
		System.out.println("x:" +x+"y:"+y);
	}
}

class EmpRecord
{
	String name;
	int salary;

	void setDetails(int sal, String ename)
	{
		name=ename;
		salary=sal;
	}
	void display()
	{
		System.out.println("Emp Name " +name+ " salary : " +salary);
	}
}

class Demo
{
	public static void main(String s[])
	{
		XYDetails obj1 = new XYDetails();
		obj1.setXY(10,40);
		obj1.display();
		EmpRecord e1=new EmpRecord();
		e1.setDetails(10000,"XYZ");
		e1.display();
	}
}


