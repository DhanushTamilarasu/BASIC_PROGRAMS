package madhu;
import java.util.*;
public class Samecharacter {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String st=s.nextLine();
		for(int i=1;i<st.length();i++)
		{
		if(st.charAt(0)==st.charAt(i))
		{
			System.out.println("yes");
			break;
		}
		else
		{
			System.out.println("no");
			break;
		}
		
	}
	}

}
