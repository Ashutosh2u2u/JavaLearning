package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		//if we get reminder =0 then number is not prime n%i=0
		boolean flag=false;
		int val =37;
		for(int i=2;i<val/2;i++)
		{
			if(val%i==0)
			{
				flag=true;
				break; //break after 1st successful getting of reminder 0
			}
			
		}
		if(flag)
		{
			System.out.println("It is not a prime number");
		}
		else
		{
			System.out.println("Is is a prime number");
		}

	}

}
