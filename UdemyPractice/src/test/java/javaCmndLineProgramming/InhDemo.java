package javaCmndLineProgramming;

class A1{
	int x,y,s;

	A1(int x,int y)
	{						
		this.x=x;
		this.y=y;
	}
	void sum(){
		s=x+y;
	}
}

class B1 extends A1{
	int avg;
	B1(int x,int y)
	{
		super(x,y);

	}
	void average()
	{
		sum();
		avg=s/2;
	}

	void display(){

		System.out.println("The sum is : " +s);  
		System.out.println("The average is : " +avg);
	}
}

class InhDemo{
	public static void main(String s[]){

		B1 b1=new B1(20,40);
		b1.average();
		b1.display();
	}
}      