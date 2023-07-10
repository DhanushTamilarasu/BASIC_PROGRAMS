package madhu;
import java.util.*;
public class Validation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int n=s.length();
		boolean b=true;
		if(n>=5&&n<=15)
		{
			for(int i=0;i<n;i++)
			{
				b=true;
				char c=s.charAt(i);
				if(Character.isAlphabetic(c)&&c!=' ')
				{
					b=true;
				}
				else if(Character.isDigit(c)||c!=' ')
				{
					b=false;
				}
				
			}
		}
		else
		{
			System.out.println("atleast 5 char");
			//System.exit(0);
		}
		if(b==true)
		{
			System.out.println("valid str");
		}
		else
		{

			System.out.println("invalid str");
			}
		
	}

}
