package madhu;
import java.util.*;
public class splcharacter {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("variables");
	String st=s.nextLine();
	char c[]=st.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		
		if(Character.isDigit(c[i]))
		{
			System.out.println(c[i]);
		}
		
        		
	}
	

}
}
