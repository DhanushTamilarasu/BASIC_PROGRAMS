package madhu;
import java.util.*;
public class array_swap {
	public static void main(String args[])
	{
		int i;
		int temp=0;
		Scanner s=new Scanner(System.in);
		int n[]=new int[8];
		for(i=0;i<n.length;i++)
		{
			n[i]=s.nextInt();
		}
		for(i=0;i<n.length;i+=2)
		{
			temp=n[i];
			n[i]=n[i+1];
			n[i+1]=temp;
		}
		for(i=0;i<n.length;i++)
		{
	System.out.println(n[i]);
	}
	}
}