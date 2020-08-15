package javaCmndLineProgramming;
public class Empdetail
{
	public static void main(String args[])
	{
		String A[][]={{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
				{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
				{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
				{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
				{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
				{"1006","Suman","01/01/2000","e","Manufacturing","23000","9000","4400"},
				{"1007","Tanmay","12/06/2006","c","R&D","PM","29000","12000","10000"}};


		String B[][]={{"e","Engineer","20000"},
				{"c","Consultant","32000"},
				{"k","Clerk","12000"},
				{"r","Receptionist","15000"},
				{"m","Manager","40000"}};


		int empid=Integer.parseInt(args[0]);
		System.out.println("Emp no Name Department Designation Salary");
		switch(empid)  {

		case 1001 : for(int i=0;i<A.length;i++)
			if(Integer.parseInt(A[i][0])==empid)
			{System.out.print(A[i][0]+" ");
			System.out.print(A[i][1]+" ");

			for(int j=0;j<B.length;j++)
			{
				if(B[j][0]==A[i][3])
				{
					System.out.print(A[i][4]+" ");
					System.out.print(B[j][1]+" ");
					int salary=Integer.parseInt(A[i][5])+Integer.parseInt(A[i][6])+Integer.parseInt(A[i][7])+Integer.parseInt(B[j][2]);
					System.out.print(salary+" ");
				}
			}
			}
		break;
		case 1002 : for(int i=0;i<A.length;i++)
			if(Integer.parseInt(A[i][0])==empid)
			{
				System.out.print(A[i][0]+" ");
				System.out.print(A[i][1]+" ");

				for(int j=0;j<B.length;j++)
				{
					if(B[j][0]==A[i][3])
					{
						System.out.print(A[i][4]+" ");
						System.out.print(B[j][1]+" ");
						int salary=Integer.parseInt(A[i][5])+Integer.parseInt(A[i][6])+Integer.parseInt(A[i][7])+Integer.parseInt(B[j][2]);
						System.out.print(salary+" ");
					}
				}
			}
		break;
		case 1003 : for(int i=0;i<A.length;i++)
			if(Integer.parseInt(A[i][0])==empid)
			{
				System.out.print(A[i][0]+" ");
				System.out.print(A[i][1]+" ");

				for(int j=0;j<B.length;j++)
				{
					if(B[j][0]==A[i][3])
					{
						System.out.print(A[i][4]+" ");
						System.out.print(B[j][1]+" ");
						int salary=Integer.parseInt(A[i][5])+Integer.parseInt(A[i][6])+Integer.parseInt(A[i][7])+Integer.parseInt(B[j][2]);
						System.out.print(salary+" ");
					}
				}
			}
		break;
		case 1004 : for(int i=0;i<A.length;i++)
			if(Integer.parseInt(A[i][0])==empid)
			{            
				System.out.print(A[i][0]+" ");
				System.out.print(A[i][1]+" ");

				for(int j=0;j<B.length;j++)
				{
					if(B[j][0]==A[i][3])
					{
						System.out.print(A[i][4]+" ");
						System.out.print(B[j][1]+" ");
						int salary=Integer.parseInt(A[i][5])+Integer.parseInt(A[i][6])+Integer.parseInt(A[i][7])+Integer.parseInt(B[j][2]);
						System.out.print(salary+" ");
					}
				}
			}
		break;
		case 1005 : for(int i=0;i<A.length;i++)
			if(Integer.parseInt(A[i][0])==empid)
			{
				System.out.print(A[i][0]+" ");
				System.out.print(A[i][1]+" ");

				for(int j=0;j<B.length;j++)
				{
					if(B[j][0]==A[i][3])
					{
						System.out.print(A[i][4]+" ");
						System.out.print(B[j][1]+" ");
						int salary=Integer.parseInt(A[i][5])+Integer.parseInt(A[i][6])+Integer.parseInt(A[i][7])+Integer.parseInt(B[j][2]);
						System.out.print(salary+" ");
					}
				}
			}
		break;
		case 1006 : for(int i=0;i<A.length;i++)
			if(Integer.parseInt(A[i][0])==empid)
			{            

				System.out.print(A[i][0]+" ");
				System.out.print(A[i][1]+" ");

				for(int j=0;j<B.length;j++)
				{
					if(B[j][0]==A[i][3])
					{
						System.out.print(A[i][4]+" ");
						System.out.print(B[j][1]+" ");
						int salary=Integer.parseInt(A[i][5])+Integer.parseInt(A[i][6])+Integer.parseInt(A[i][7])+Integer.parseInt(B[j][2]);
						System.out.print(salary+" ");
					}
				}
			}
		break;
		case 1007 : for(int i=0;i<A.length;i++)
			if(Integer.parseInt(A[i][0])==empid)
			{

				System.out.print(A[i][0]+" ");
				System.out.print(A[i][1]+" ");

				for(int j=0;j<B.length;j++)
				{
					if(B[j][0]==A[i][3])
					{
						System.out.print(A[i][4]+" ");
						System.out.print(B[j][1]+" ");
						int salary=Integer.parseInt(A[i][5])+Integer.parseInt(A[i][6])+Integer.parseInt(A[i][7])+Integer.parseInt(B[j][2]);
						System.out.print(salary+" ");
					}
				}
			}
		break;
		default   : System.out.println("There is no employee with id no " +empid);
		break;
		}
	}
}