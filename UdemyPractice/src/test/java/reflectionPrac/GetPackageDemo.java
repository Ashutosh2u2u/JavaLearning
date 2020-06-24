package reflectionPrac;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetPackageDemo {

	public static void main(String[] args) {
		Class<Person2> personClass=null;
		try {
			personClass=(Class<Person2>) Class.forName("reflectionPrac.Person2");
		} 
		catch (ClassNotFoundException e) 
		{			
			e.printStackTrace();
		} 

		//To get superclass
		System.out.println(personClass.getSuperclass().getName());
		
		//to get interfaces
		Class[] interfaces=personClass.getInterfaces();
		for(Class cl:interfaces){
			System.out.println(cl.getName());
		}

		/*

		 //to get package name
		System.out.println(personClass.getPackage());

         //to get public fields
		Field[] fields=personClass.getFields();
		for(Field field:fields)
			System.out.println(field.getName()+"--"+field.getType());

		//for private fields
		Field[] fields=personClass.getDeclaredFields();

		for(Field f: fields)
			//	f.setAccessible(true);
			System.out.println(f.getName());

		//for private methods
		Method[] m=personClass.getDeclaredMethods();

		for(Method p: m)
			//	p.setAccessible(true);
			System.out.println(p.getName());

         //to get public methods
		Method[] methods=personClass.getMethods();
		for(Method m:methods)
			System.out.println(m.getName()+" Return type is: "+m.getReturnType());*/


	}	
}
class Emplyee{

}
class Person2 implements Comparable<Person>,Serializable{

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
	private String returnString()
	{
		return this.name;

	}
	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}