package javaCmndLineProgramming;
public class Arraydemo2{
   public static void main(String s[]){
      int A[]=new int[5];
       for(int i=0;i<A.length;i++)
        { A[i]=Integer.parseInt(s[i]);
	}
       for(int i=0;i<A.length;i++)
         System.out.print(A[i] +" ");
    }
}