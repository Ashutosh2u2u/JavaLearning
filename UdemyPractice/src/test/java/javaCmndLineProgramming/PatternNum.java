package javaCmndLineProgramming;
public class PatternNum
{
public static void main(String args[])
{
  
 int n=Integer.parseInt(args[0]);      
 int i=1;
 int j=1;
 
 for(i=1;i<=n;i++)
 { 
    for(j=1;j<=i;j++)
     {
       System.out.print(j); 
     }
     System.out.println(" ");
 }


}
}