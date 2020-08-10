package encapsulationPrac;

//Encapsulation: It is a mechanism of wrapping the data(variables) and code acting on the data(methods) together as a single unit
//Encapsulation used for providing security
//To achieve encapsulation 1. make all variables as private 2.define getter and setter to access and modify the instance variable 
public class Company 
{
	private int emp_id; 

	public int getEmp_id() 
	{
		return emp_id;
	}

	public void setEmp_id(int empID)
	{
		this.emp_id = empID;
	}



	public static void main(String[] args)
	{
		Company cp=new Company();
		cp.setEmp_id(112);
		System.out.println(cp.getEmp_id());
	}

}
