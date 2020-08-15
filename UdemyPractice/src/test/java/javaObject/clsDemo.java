package javaObject;
class clsDemo
{

	int id;
	String name;
	int salary;

	void setId(int i)
	{
		id=i;
	}
	void setName(String n)
	{
		name=n;
	}
	void setSalary(int s){
		salary=s;
	}
	void getEmployeeDetails()
	{
		System.out.println(name+ " salary is " +salary);
	}
	public static void main(String s[])
	{
		clsDemo obj1=new clsDemo();
		obj1.setId(1200);
		obj1.setName("ANKIT");
		obj1.setSalary(26000);
		obj1.getEmployeeDetails();
	}
} 