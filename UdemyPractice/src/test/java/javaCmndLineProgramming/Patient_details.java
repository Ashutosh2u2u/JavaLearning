package javaCmndLineProgramming;
class patient{
 String name;
 double weight;
 double height;
  
 /*patient(){
 name="NULL";
 weight=1;
 height=1;
 }*/
 
 patient(String name, double weight, double height){
 this.name=name;
 this.weight=weight;
 this.height=height;
 }

 double BMI(){
 double bmi=(weight/(height*height))*703;
 return bmi;
 }

 

}

class Patients{
String P_name[]={"p1","p2","p3","p4","p5","p6","p7","p8","p9","p10"};
double height[]=new double[10];
double weight[]=new double[10];
double bmi[]=new double[10];
void BMI()
{
for(int i=0;i<10;i++)
{
height[i]=((double)((Math.random()*(80-55+1))+55));
weight[i]=((double)((Math.random()*(220-88+1))+88));
bmi[i]=(weight[i]/(height[i]*height[i]))*703;
if(bmi[i]>25.0)
{System.out.println("Patients name " +P_name[i]+" Height: "+height[i]+" Weight: "+weight[i]+"BMI:"+bmi[i]);
}
}
}
}

class Patient_details
{
 public static void main(String s[]){

patient p = new patient("ANKIT",180,55.06);
double bmi=p.BMI();
System.out.println("The BMI of patient is " +bmi);
Patients ps=new Patients();
ps.BMI();
}
}