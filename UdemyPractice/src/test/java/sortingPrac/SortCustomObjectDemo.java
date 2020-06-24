package sortingPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCustomObjectDemo {
	
	public static void main(String[] arg)
	{
		List<Book> books=new ArrayList<>();
		books.add(new Book("Valmiki", "Ramayan", 1008));
		books.add(new Book("H C verma", "Concepts of physics", 788));
		books.add(new Book("R D Sharma", "Mathematics", 987));
		books.add(new Book("Kapoor", "AAjTak", 15));
		
		Collections.sort(books);
		System.out.println(books);
		//consistence for reversing the order rather than placing -ve sign
		Collections.sort(books ,new BookComparator().reversed());
		
		System.out.println(books);
	}
}
