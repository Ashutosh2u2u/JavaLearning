package udemyPrac;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerWildCard {
	
	
	public static void show(List<? super Number> list){
		for(Object o: list)
		{
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		
		List<Serializable> list=new ArrayList<>();
		list.add("Ashu");
		list.add("Ashut");
		list.add("Ashuto");
		list.add("Ashutos");
		show(list);
		//sum(Arrays.asList(1,2,7,9,6,44));

	}

}
