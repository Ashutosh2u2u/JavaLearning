package sortingPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortCollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> num=new ArrayList<>();
		num.add(99);
		num.add(1);
		num.add(33);
		num.add(15);
		num.add(-7);
		num.add(86);
		
		List<String> str=new LinkedList<>();
		str.add("a");
		str.add("p");
		str.add("e");
		str.add("b");
		str.add("k");
		str.add("t");
		
		Collections.sort(num);
		Collections.sort(str);
		
		System.out.println(num+ "***" +str);
		
		

	}

}
