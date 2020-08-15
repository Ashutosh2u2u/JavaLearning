package javaCmndLineProgramming;
public class Sample8{
public static void main(String args[]){
  
 int n=Integer.parseInt(args[0]);  
 //\* Java program for 1+2+3+4+5......+n *\
 int i=1;
 int sum=0;
 
 for(i=1;i<=n;i++)
 { sum=sum+i;
 }

 System.out.println("The sum of " +n+ " is " +sum);

}
}