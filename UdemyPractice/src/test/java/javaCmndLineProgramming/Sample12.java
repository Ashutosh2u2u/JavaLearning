package javaCmndLineProgramming;
public class Sample12{
public static void main(String args[]){
  
 int n=Integer.parseInt(args[0]);     
 int i=1;
 int j=1;
 int k=n+(n-1);
 int p=0;
 for(i=1;i<=k;i++)
 { 
    if(i<n+1)
     {for(j=1;j<=i;j++)
      {
       System.out.print(i); 
      }
      System.out.println(" ");
     }
 
     else
      {
    	 p=((k+1)-i);
        for(j=p;j>=1;j--)
        {
          System.out.print(p);
        }
       System.out.println(" ");
       }
}

}
}