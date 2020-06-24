package collectionPrac;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		//follow LIFO
		java.util.Stack<Integer> stack=new Stack<>();
		stack.push(111111);
		stack.push(2272);	
		stack.push(222);
		stack.push(2266);
		stack.push(22);
		System.out.println(stack.size());	
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		for(Integer i:stack)
		{
			System.out.println(i);
			
				}
		
	}

}
