package javaObject;
class EmpDetails
{
	String name;
	int sal;   
	
	EmpDetails()
	{
		this.name=null;
		this.sal=0;
	}
	EmpDetails(String name, int sal)
	{
		this.name=name;
		this.sal=sal;
	} 
	void showEmp()
	{
		System.out.println("Emp Name: " +name+ "\n Salary : " +sal);
	}
}
class Empdemo
{
	public static void main(String s[])
	{
		EmpDetails e1=new EmpDetails("Suresh",20000);
		e1.showEmp();
		EmpDetails e2=new EmpDetails();
		e2.showEmp();
	}
}