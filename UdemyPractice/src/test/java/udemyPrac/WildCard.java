package udemyPrac;

import java.util.Arrays;
import java.util.List;

public class WildCard {
	
	
	public static void sum(List<? extends Number> list){
		double sum=0.0;
		for( Number n: list)
		{
			sum=sum+n.doubleValue();
		}
		System.out.println("The sum is " +sum);
	}

	public static void main(String[] args) {
		sum(Arrays.asList(1,2,7,9,6,44));

	}

}
