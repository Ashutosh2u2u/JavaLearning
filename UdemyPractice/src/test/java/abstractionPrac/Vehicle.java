package abstractionPrac;

abstract class Vehicle
{
//abstract method don't have body or implementation
	//abstract class can contain both abstract or concrete methods
	// we can create object for abstract class
	//if any method is abstract then class should also have abstract keyword viceversa is not true
	//abstraction achieved (0-100)%
	//Abstraction-hiding the implementation details show necessary details only
	abstract void start();
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("car starts with key");
	}

}


