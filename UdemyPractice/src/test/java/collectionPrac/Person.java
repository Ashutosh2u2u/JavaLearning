package collectionPrac;

public class Person implements Comparable<Person>
{
	private String name;
	private int age;

	public Person(){

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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


	@Override
	public String toString(){
		return "Name of person: "+ this.name+ " and Age: " + this.age ;

	}

	
	//****if prioritise on the basis of age
	
	/*@Override
	public int compareTo(Person otherPerson) {
		
		return Integer.compare(this.age, otherPerson.age);
	}*/

	//****if prioritise on the basis of Name**---Put -ve sign for reversing the order
	@Override
	public int compareTo(Person otherPerson) {
		
		return -this.name.compareTo(otherPerson.getName());
	}




}
