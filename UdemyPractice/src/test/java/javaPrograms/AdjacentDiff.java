package javaPrograms;

public class AdjacentDiff {

	public static void main(String[] args) 
	{
		int a[]= {2,5,3,7,6,9};
		int diff=0;
		for(int i=0;i<a.length-1;i++)
		{
			//int diff=0;
				if(a[i+1]-a[i]>diff)//compairing the diff of adjacent number in array
				{
				diff=a[i+1]-a[i];	
				}
			
		}
		System.out.println("min diff between adjacent no of array " +diff);

	}

}
