package collectionPrac;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(12);
		list.add(121);
		list.add(1221);
		list.add(12221);
		System.out.println(list.size());
		list.remove(1);//more efficient
		list.isEmpty();
		list.size();
		for(Integer i:list)
		{
			System.out.println(i);
			
				}
		System.out.println(list.get(1));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
	}

}
