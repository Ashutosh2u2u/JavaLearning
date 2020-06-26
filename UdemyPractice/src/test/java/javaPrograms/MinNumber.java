package javaPrograms;

public class MinNumber {
//minimum number from multidimentional array
	public static void main(String[] args) {
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min=abc[0][0];//assuming abc[0][0] is minimum among the all
		for(int i=0;i<3;i++) 
		{			
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)  //if any number less than assumed minimum value
				{
					min=abc[i][j];// replaced assumed min with actual min
				}
			}
		}
		System.out.println("min number is :" +min );
	}

}
