package javaCmndLineProgramming;
public class pattern{
public static void main(String args[]){

 int n=Integer.parseInt(args[0]);
 int i=1;
 int j=1;
 
for(i=1;i<=n;i++)
{
  while(j<=i)
  {
    System.out.print( "*" );
    j++;  
  }
j=1;
 System.out.println();
}
}
}