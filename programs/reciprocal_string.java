package madhu;
import java.util.*;
public class reciprocal_string {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the str");
		String s1=s.nextLine();
		char c[]=s1.toCharArray();
		String h=" ";
		for(int i=0;i<c.length;i++)
		{
			if(Character.isLowerCase(c[i]))
			{
				 h+=(char)('z'-c[i]+'a');
			}
			else if(Character.isUpperCase(c[i]))
			{
				 h+=(char) ('Z'-c[i]+'A');
			}
		
			
		}
		System.out.println(""+h);
	}

}
