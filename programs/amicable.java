package madhu;
import java.util.*;
public class amicable {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter num1");
		int n1=s.nextInt();
		System.out.println(" enter num2");
		int n2=s.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0)
			{
				sum1+=i;
			}
		}
		for(int i=1;i<=n2;i++)
		{
			if(n2%i==0)
			{
				sum2+=i;
			}
		}
		if(sum1==sum2&&sum2==sum1)
		{
		System.out.println("amicable");
		}
		else
		{
			System.out.println("not amicable");
		}
	}

}
