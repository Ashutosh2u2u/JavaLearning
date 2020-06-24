package collectionPrac;

import java.util.ArrayDeque;
import java.util.Deque;


public class DequeDemo {

	public static void main(String[] args) {
		
				Deque<Integer> deque=new ArrayDeque<>();
				deque.offerFirst(22);
				deque.addLast(33);
				deque.offerFirst(11);
				deque.addLast(44);
				deque.removeFirst();
				deque.removeLast();
				deque.offerFirst(55);
				
				for(Integer i:deque)
				{
					System.out.println(i);
				}
				
				
	}

}
