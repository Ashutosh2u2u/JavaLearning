package collectionPrac;
import java.util.LinkedList;
import java.util.Queue;

public class QueuetDemo {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		queue.add("Ram");
		queue.add("Sita");
		queue.add("aaaaa");
		queue.add("abcd");
		queue.add("a111a");
		
		
		for(String s:queue)
		{
			System.out.println(s);
		}
		
		System.out.println(queue.element());
		System.out.println(queue.size());
		System.out.println(queue.remove());
		System.out.println(queue.size());
		System.out.println(queue.element());
	}

}
