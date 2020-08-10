package abstractionPrac;

class Scooter extends Vehicle
{
	//here scooter class extends abstract class vehicle having abstract method start()
	void start()
	{
		System.out.println("scooter starts with kick");
	}


	public static void main(String[] args) 
	{
		Scooter sc=new Scooter();
		sc.start();

		Car cr=new Car();
		cr.start();
	}

}
