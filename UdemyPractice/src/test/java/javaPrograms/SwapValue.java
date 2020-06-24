package javaPrograms;

public class SwapValue {

	public static void main(String[] args) {
		swapwithTemp();
		swapwithoutTemp();
		}
	public static void swapwithTemp() {
	int a =5;
	int b=4;
	int temp;
	//swap using temp variable
	temp=a;
	a=b;
	b=temp;
	System.out.println("value of a and b respectively: " +a+ " , " +b);
	}
	public static void swapwithoutTemp() {
		int a =5;
		int b=4;
		
		//swap using temp variable
		a=a+b;//a=9
		b=a-b;//b=5
		a=a-b;//a=4
		System.out.println("value of a and b respectively: " +a+ " , " +b);
		}

}
