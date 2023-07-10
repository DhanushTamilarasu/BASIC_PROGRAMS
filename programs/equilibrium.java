package madhu;
import java.util.*;
public class equilibrium {
	public static void main(String args[])
	{

		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		System.out.println("enter no");
		int a[]=new int[n];
		int sum=0;
		int sum1=0;
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		if(n%2!=0){
			if(i<n/2)
				sum+=a[i];
			else if(i>n/2)
			
				sum1+=a[i];
			}
			else{
				if(i<n/2)
					sum+=a[i];
				else if(i>=n/2)
				
					sum1+=a[i];
				}
		System.out.println(""+sum+""+sum1);			
			}
			}



