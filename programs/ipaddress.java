package madhu;
import java.util.*;
public class ipaddress {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter address");
		String st=s.nextLine();
		char dot='.';
		char c[]=st.toCharArray();
		int d=3,count=0;
		boolean b=true;
		for(int i=0;i<c.length;i++)
		{ count=0;
		if(c[i]==dot)
		{
			continue;
		}
		if(c[i]>=0&&c[i]<=255)
		{
			if(c[i]==d)
			{
			b=true;		
		}
		else
		{
			b=false;
		}
			
		}
	
	if(b)
	{
		System.out.println("valid");
	}
	else
	{
		System.out.println("invalid");

	}
	}

}}
