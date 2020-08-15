package javaCmndLineProgramming;
class StaticDemo{
      static int x=5;
       StaticDemo(){
        System.out.println("I am in Constructor");
         }
       static{
        System.out.println("I am in first static block");
         }
       static void m1(){
       System.out.println("I am in static m1 method");
       }
       static{
       System.out.println("I am in second static block");
       m1();
        }

      void show(){
         System.out.println("I am in non static method" +x);
       }
public static void main(String s[]){
System.out.println("I am in main method");

StaticDemo a1=new StaticDemo();
a1.show();
}
}