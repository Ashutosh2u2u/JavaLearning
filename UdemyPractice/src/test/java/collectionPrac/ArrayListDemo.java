package collectionPrac;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("As");
		list.add("Ash");
		list.add("Ashu");
		list.add("Ashutosh");
		System.out.println(list.size());
		list.remove(1);
		list.isEmpty();
		list.size();
		for(String s:list)
		{
			System.out.println(s);
			
				}
		System.out.println(list.get(1));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
	}

}
