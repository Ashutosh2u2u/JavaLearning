package collectionPrac;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	//sorted ..no duplicate allowed
		Set<Integer> treeSet=new TreeSet<>();
		treeSet.add(55);
		treeSet.add(5);
		treeSet.add(555);
		treeSet.add(-5);
		treeSet.add(5555);
		treeSet.add(5);
		
		for(Integer n: treeSet){
			System.out.println(n);
		}
		

	}

}
