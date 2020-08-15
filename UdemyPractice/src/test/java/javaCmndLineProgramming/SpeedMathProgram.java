package javaCmndLineProgramming;
public class SpeedMathProgram{
public static void main(String s[])
{
   
 int x=Integer.parseInt(s[0]);
 int y=Integer.parseInt(s[1]);
 float speed=0;
 speed=((18*x)+(25*y))/(18*y);
 System.out.println("The speed of the running train is " +speed+ " m/s ");
}
}
