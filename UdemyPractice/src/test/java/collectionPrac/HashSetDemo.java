package collectionPrac;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		//insertion order not fixed..duplicate consider  as single entry 
		Set<String> hashSet=new HashSet<>();
		hashSet.add("Ram");
		hashSet.add("Raj");
		hashSet.add("Rat");
		hashSet.add("Rag");
		hashSet.add("Rax");
		hashSet.add("Ram");
		System.out.println(hashSet.contains('p'));
		System.out.println(hashSet.size());
		
		for(String s: hashSet)
		{
			System.out.println(s);

		}
	}

}
