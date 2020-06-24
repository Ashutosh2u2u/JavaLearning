package collectionPrac;

import java.util.List;
import java.util.Vector;

//vector is synchronized
public class VectorDemo {

	public static void main(String[] args) {
		//vector(capacity,capacityIncrement)
		List<Integer> vector=new Vector<>(10,5);
		vector.add(1);
		vector.add(12);
		vector.add(121);
		vector.add(1221);
		vector.add(12221);
		System.out.println(vector.size());
		vector.remove(1);		
		for(Integer i:vector)
		{
			System.out.println(i);
			
				}
		System.out.println(vector.get(1));
		System.out.println(vector.isEmpty());
		System.out.println(vector.size());
		
	}

}
