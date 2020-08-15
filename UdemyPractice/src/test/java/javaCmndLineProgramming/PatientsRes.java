package javaCmndLineProgramming;

class patientDetail
{
 String name;
 double weight;
 double height;
  
 patientDetail()
 {
 name="NULL";
 weight=1;
 height=1;
 }
 
 patientDetail(String name, double weight, double height)
 {
 this.name=name;
 this.weight=weight;
 this.height=height;
 }

 double BMIPatient()
 {
 double bmi=(weight/(height*height))*703;
 return bmi;
 }

 

}

class PatientRes
{
public static void main(String s[])
{
	patientDetail p[] = new patientDetail[3];

p[0]=new patientDetail();
double k= p[0].BMIPatient();
System.out.println("The Bmi of patient is " +k);

p[0]=new patientDetail("RAM",155,60);
double x= p[0].BMIPatient();
System.out.println("The Bmi of patient is " +x);

p[1]=new patientDetail();
p[1]=new patientDetail("SHYAM",160,65);
double y= p[1].BMIPatient();
System.out.println("The Bmi of patient is " +y);

p[2]=new patientDetail();
p[2]=new patientDetail("SAHIL",180,70);
double z= p[2].BMIPatient();
System.out.println("The Bmi of patient is " +z);

}
}