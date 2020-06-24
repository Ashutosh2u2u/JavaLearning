package reflectionPrac;


public class ReflectionClassDemo2 {

	public static void main(String[] args) {
			
		Class personClass=null;
		
		
		 try {
			personClass=Class.forName("reflectionPrac.Person1");
		} 
		 catch (ClassNotFoundException e) 
		 {			
			e.printStackTrace();
		} 
			System.out.println(personClass.getName());
		
	}	
}
	class Person1{
		
	}

