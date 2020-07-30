package collectionPrac;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
//maintain the insertion order
		//insertion order predictable..duplicate consider  as single entry 
		Set<String> LinkedhashSet=new LinkedHashSet<>();
		LinkedhashSet.add("Ram");
		LinkedhashSet.add("Raj");
		LinkedhashSet.add("Rat");
		LinkedhashSet.add("Rag");
		LinkedhashSet.add("Rax");
		LinkedhashSet.add("Ram");
		System.out.println(LinkedhashSet.contains('p'));
		System.out.println(LinkedhashSet.size());
		LinkedhashSet.remove("Ram");
		
		for(String s: LinkedhashSet)
		{
			System.out.println(s);

		}
	}

}
