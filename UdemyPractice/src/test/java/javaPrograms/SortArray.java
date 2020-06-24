package javaPrograms;

public class SortArray {
//Bubble sort of array elements
	public static void main(String[] args) {
		
		int a[]= {4,7,1,5,3,2};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			//compare with next elements of array
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					//Swap the number
				}
			}
		}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
	

}
