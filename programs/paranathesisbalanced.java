package madhu;
import java.util.*;
public class paranathesisbalanced {
	public static void main(String args[])
	{
		int j=0;
		Scanner s=new Scanner(System.in);
		System.out.println("expression");
		String st=s.next();
		char c[]=st.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='(')
			{
				j++;
				System.out.println("open bracket"+c[i]);
			}
			else if(c[i]==')')
			{
				j--;
				System.out.println("close bracket"+c[i]);
			}
			if(j<0)
			{
				break;
			}
		}
			if(j==0)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
	

}
