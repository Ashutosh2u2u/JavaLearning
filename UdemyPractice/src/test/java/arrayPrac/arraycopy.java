package arrayPrac;

public class arraycopy
{
public static void main(String args[])
{
int source[]={100,200,300,400,500,600};
int dest[]=new int[10];

//copy elements from source to dest
System.arraycopy(source,0,dest,0,source.length);

//travers and print dest array
for(int i=0;i<dest.length;i++)
{
	System.out.println("Element at injdex" +i+ ":" +dest[i]);
}
}
}