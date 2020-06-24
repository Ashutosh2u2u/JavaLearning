package sortingPrac;

import java.util.Arrays;

public class Sort1DTest {

	public static void main(String[] args) {
	Integer[] num={1,23,4,65,29,11};
	String[] str={"Aam","Ram","Tata","Ball","Pop"};
	Arrays.sort(num);
	Arrays.sort(str);
	
	for(Integer i: num)
	{
		System.out.print(i);
	}
	for(String s: str)
	{
		System.out.println(s);
	}
	}

}
