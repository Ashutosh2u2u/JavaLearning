package arrayPrac;
public class arraycopy1{
public static void main(String args[])
{
int a[]=new int[]{1,2,3,4,5,6,7,8,9,0};
int b[]=new int[50];

System.arraycopy(a,0,b,19,a.length);

for(int i=0;i<b.length;i++)
{
	System.out.println("Element at index" +i+ ":" +b[i]);
}
}
}