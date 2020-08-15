package javaObject;

class EmployeeRec
{
	int id;
	String name;
	int salary;

	void EmpDetails(int no, String n, int s)
	{
		id=no; 
		name=n;
		salary=s;
	}
	void getEmployeeDetails()
	{
		System.out.println(name+ " salary is " +salary+ " with ID number" +id);
	}
}


public class EmployeeDemo
{
	public static void main(String s[])
	{
		EmployeeRec obj1 = new EmployeeRec();
		obj1.EmpDetails(1002,"JOHN",40000);
		obj1.getEmployeeDetails();
	}


}

