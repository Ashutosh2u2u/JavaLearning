package javaPrograms;

public class FibanocciSeries {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21...
		int a=0;
		int b=1;
		int sum=0;
		
		int i=1;
		while(i<8)
		{
			sum=a+b;//get sum of previous two number
			System.out.println(sum);
			//swap the number for every new iteration i.e sum become b and b become a
			a=b;
            b=sum;
			i++;			
		}
	}
}
