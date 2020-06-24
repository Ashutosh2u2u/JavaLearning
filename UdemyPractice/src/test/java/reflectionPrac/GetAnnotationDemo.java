package reflectionPrac;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetAnnotationDemo {

	public static void main(String[] args) {
		Class<PersonNew> personClass=null;
		try {
			personClass=(Class<PersonNew>) Class.forName("reflectionPrac.PersonNew");
		} 
		catch (ClassNotFoundException e) 
		{			
			e.printStackTrace();
		} 		

        
		Method[] methods=personClass.getMethods();
		for(Method m:methods)
			if(m.isAnnotationPresent(MyAnnotation.class)){
				System.out.println(m.getName());
			}
	}	
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	public String name();
}

class PersonNew {

	private String name;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@MyAnnotation(name="myAnnotation")
	public String returnString()
	{
		return this.name;

	}
	

}