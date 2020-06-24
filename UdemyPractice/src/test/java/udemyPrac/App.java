package udemyPrac;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static <T> void addStore(T t, List<Bucket<T>> list){
		Bucket<T> bucket = new Bucket<>();
		bucket.setItem(t);
		list.add(bucket);
		System.out.println(t.toString()+" has been added to the list...");
	}

	public static void main(String[] args) {
		List<Bucket<String>> list = new ArrayList<>();
		App.addStore("Ashu", list);
		//"type witness"
		App.<String>addStore("Daniel",list);
		//App.<int>addStore(45,list);
	}
}
class Bucket<T>{
	private T item;
	
	public T getItem(){
	return this.item;	
	}
	
	public void setItem(T item){
		this.item=item;
	}
}

