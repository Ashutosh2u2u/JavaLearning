package javaObject;
class Box
{
double width;
double height;
double depth;

  void getDetails(int x,int y,int z)
  {
    width=x;
    height=y;
    depth=z;
  }
 
  double volume()
  {
   double vol=width*height*depth;
   return vol;
  }
}
public class Volume
{
public static void main(String s[])
{

 Box obj1=new Box();
 obj1.getDetails(10,20,30);
 double vol=obj1.volume();
 System.out.println("The volume of box is " +vol);
}
}