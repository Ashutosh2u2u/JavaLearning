package udemyPrac;

public class UdemyTest {

	public static void main(String[] args) {
		UdemyGenericMethod GenericMethod=new UdemyGenericMethod();
		GenericMethod.showDemo("returned value is:"+"Hello");		
		GenericMethod.showDemo("returned value is:"+75.7);
		GenericMethod.showDemo("returned value is:"+'H');
		GenericMethod.testDemo(78);
		//T[] name={5,7,99,44,22,7};
		Integer[] intArray={5,7,99,44,22,7};
		String[] strArray={"Ashu","Ram","Sita","joi","poi","raj","end"};
		GenericMethod.testArray(intArray);
		GenericMethod.testArray(strArray);
		System.out.println(GenericMethod.CalculateMin(4, 100)); 
		System.out.println(GenericMethod.CalculateMin('p', 'a')); 
		
		
		

	}

}
