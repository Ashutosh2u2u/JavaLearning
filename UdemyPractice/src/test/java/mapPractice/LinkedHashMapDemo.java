package mapPractice;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> linkedHasmap=new LinkedHashMap<>();
		linkedHasmap.put("m",50);
		linkedHasmap.put("b",10);
		linkedHasmap.put("c",30);
		linkedHasmap.put("d",20);
		linkedHasmap.put("e",50);
		linkedHasmap.put("f",10);
		linkedHasmap.put("g",30);
		linkedHasmap.put("h",20);
		linkedHasmap.put("i",50);
		linkedHasmap.put("j",10);
		linkedHasmap.put("k",30);
		linkedHasmap.put("l",20);

		for(Map.Entry<String,Integer> entry: linkedHasmap.entrySet())
		{
			System.out.println("key_"+ entry.getKey()+" & value_"+entry.getValue());		

		}
	}
}
