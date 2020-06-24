package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("ram",10);
		map.put("rjm",12);
		map.put("raj",30);
		map.put("rama",10);
		
		for(Map.Entry<String,Integer> entry: map.entrySet())
		{
			System.out.println("key_"+ entry.getKey()+" & value_"+entry.getValue());		

		}
		
		System.out.println(map.get("raj"));
	}

}
