package mapPractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
//sorted according to natural ordering of its keys
	public static void main(String[] args) {

		Map<String,Integer> TreeMap= new TreeMap<>();
		TreeMap.put("Ram",55);
		TreeMap.put("Golu",33);
		TreeMap.put("Molu",22);
		TreeMap.put("Kirrish",66);
		TreeMap.put("Modi",44);
		TreeMap.put("Tata",11);	

		//sorted on the basis of key 
		for(String s : TreeMap.keySet())
		{
			System.out.println(s+ TreeMap.get(s));	
		}
	}
}
