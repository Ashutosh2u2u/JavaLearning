package udemyPrac;

public class UdemyGenericMethod {
	
	public <T> void testDemo(T t)
	{
		System.out.println("The item is :"+t.toString());
	}
	public <T> T showDemo(T t)
	{
		System.out.println("The item is :"+t.toString());
		return t;
	}
	public <T> void testArray(T[] Array)
	{
		//traverse array for each loop
		System.out.println("Array  scenario");
		for(T item: Array){
		System.out.print(item.toString()+"->");
		}
	}
	public <T extends Comparable<T>> T CalculateMin(T t1, T t2)
	{
		System.out.println("compare to scenario");
		if(t1.compareTo(t2)<0)
		{
			return t1;
		}
		
		return t2;
		
	}

}
