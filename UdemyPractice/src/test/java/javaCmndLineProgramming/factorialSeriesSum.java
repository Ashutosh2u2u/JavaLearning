package javaCmndLineProgramming;

public class factorialSeriesSum
{
public static void main(String args[]){
  
 int n=Integer.parseInt(args[0]);      
 int i=1;
 int j=1;
 int sum=0;
 int fact=1;
 for(i=1;i<=n;i++)
 { 
    for(j=1;j<=i;j++)
     {
       fact=fact*j;
     }
     sum=sum+fact;
     fact=1;
 }

 System.out.println("The sum of  " +n+ " factorial series is " +sum);

}
}