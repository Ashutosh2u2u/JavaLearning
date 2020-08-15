package javaObject;
class Employee{
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
{System.out.println(name+ " salary is " +salary+ " with ID number" +id);
}

public static void main(String s[])
{
 Employee obj1 	= new Employee();
 obj1.EmpDetails(1002,"Ankit",40000);
 obj1.getEmployeeDetails();
}


}

