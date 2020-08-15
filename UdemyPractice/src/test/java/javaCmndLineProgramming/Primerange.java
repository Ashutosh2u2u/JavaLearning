package javaCmndLineProgramming;
public class Primerange{
public static void main(String args[])
{
 
 int range1=Integer.parseInt(args[0]);
 int range2=Integer.parseInt(args[1]);   
 int i=2;
 int c=0;
 int k=0;
 int j=0;
for(j=range1;j<=range2;j++)
{
   while(i<j)
   {  if(j%i==0)
      {
       
        c++;
        break;
      }
      else

       i++;
   }
 if(c==0)
  {k++;}
i=2;
c=0;
}
if(k==0)
      System.out.println("There is no prime  number ");
 else
     System.out.println("The total number of  prime  number in the range are " +k);  
}
}