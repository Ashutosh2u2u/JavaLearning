package javaCmndLineProgramming;
class Fan
{
	static int SLOW=1;
	static int MEDIUM=2;
	static int FAST=3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	Fan()
	{
		speed=SLOW;
		on=false;
		radius=5;
		color="red";
	}
	
	Fan(int speed,boolean on, double radius, String color)
	{
		this.speed=speed;
		this.on=on;
		this.radius=radius;
		this.color=color;
	}
	
	String tostring()
	{
		return (speed+",.,"+on+",.,"+radius+",.,"+color);
	}
	public static void main(String s[])
	{
		String summary;
		Fan f1=new Fan();
		summary=f1.tostring();
		int speed1=Integer.parseInt(summary.split(",.,")[0]);
		boolean on1=Boolean.parseBoolean(summary.split(",.,")[1]);
		double radius1=Double.parseDouble(summary.split(",.,")[2]);
		String color1=(summary.split(",.,")[3]);
		System.out.println("Speed: "+speed1+" on : "+on1+" radius:"+radius1+" color:"+color1);

		Fan f2=new Fan(MEDIUM, true, 4, "yellow");
		summary=f2.tostring();
		speed1=Integer.parseInt(summary.split(",.,")[0]);
		on1=Boolean.parseBoolean(summary.split(",.,")[1]);
		radius1=Double.parseDouble(summary.split(",.,")[2]);
		color1=(summary.split(",.,")[3]);
		System.out.println("Speed: "+speed1+" on : "+on1+" radius:"+radius1+" color:"+color1);
	}
}		