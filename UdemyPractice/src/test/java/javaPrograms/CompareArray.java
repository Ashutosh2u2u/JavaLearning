package javaPrograms;

import java.util.ArrayList;

public class CompareArray {
//compare same indexes of 2 diff arrays and create another array for matching values
	public static void main(String[] args)
	{
		int a[]= {1,4,7,9};
		int b[]= {1,3,7,9};
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i])
			{
				//create a new array for matching value
				al.add(a[i]);
				//convert arrayList to array al.toArray()				
			}			
		}
		Object[] c=al.toArray();
		//advance for loop
		for(Object ob: c)
		{
			System.out.println(ob);
		}

	}

}
