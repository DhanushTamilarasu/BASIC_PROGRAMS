package madhu;
import java.util.*;
public class Car_fine {
	public static void main(String args[])
	{
		   int i,count;

	   Scanner s=new Scanner(System.in);
	   System.out.println("enter size str");
	   int n=s.nextInt();
	   System.out.println("array");
	   int a[]=new int[n];
	   int sum=0;
	   for( i=0;i<n;i++)
	   {
		   a[i]=s.nextInt();
	   }
	   System.out.println("date");
	   int date=s.nextInt();
	   if(date%2==0) {
	   for( i=0;i<a.length;i++)
	   {
		   count =0;
		   }
	if(a[i]%2==0)
	   {

		count=1;
		}
	else
	{
		count=0;
	   
	    System.out.println(a[i]);
		a[i]=250;  
	   }
	
	   System.out.println("odd"+sum);
	}
	else
	{
		for( i=0;i<a.length;i++)
		{
			  count =0;
			 if(a[i]%2!=0)
			 {
				 count=0;
				 a[i]=250;
				 sum+=a[i];
			 }
			 else
			 {
				 count=1;
			 }
		}
		System.out.println(""+sum);
			 }
			 }
		}
	