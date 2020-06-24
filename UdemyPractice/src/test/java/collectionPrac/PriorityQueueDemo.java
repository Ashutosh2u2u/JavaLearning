package collectionPrac;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Person> queue=new PriorityQueue<>();
		//queue.add(new Person("Raju",45));	
	    queue.add(new Person("Raj",9));
		queue.add(new Person("Raja",25));
		queue.add(new Person("Raju",42));		

		while(queue.peek()!=null)

			System.out.println(queue.poll());

	}
}