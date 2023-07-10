package madhu;
import java.util.*;
public class array3 {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("array");
		int n=s.nextInt();
		System.out.println("elem");
		int a[]=new int[n];
		int b=0,d=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]<10)
			{
				b+=a[i];
			}
			else
			{
				d+=a[i];
			}
		}
		System.out.println("single digits:"+b);
		System.out.println("double digits:"+d);
	}

}
