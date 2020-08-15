package javaCmndLineProgramming;
public class Series1{
public static void main(String args[]){
  
 int n=Integer.parseInt(args[0]);      
 int i=1;
 int sum=0;
 int p=0;
 for(i=1;i<=n;i++)
 { sum=sum+i;
   p=(p*10)+i;
 
 }

 System.out.println("The sum of the digits of  " +p+ " is " +sum);

}
}