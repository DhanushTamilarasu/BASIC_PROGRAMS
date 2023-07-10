package madhu;
import java.util.*;
public class demo1 {
	public static void main(String args[])
	{ 
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter str");
		String st=s.next();
		char c[]=st.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count++;
			System.out.println("vowels::"+c[i]);
			System.out.println("vowels:"+count);
			}
			else {
				
				System.out.println("constant::"+c[i]);
				System.out.println("constant:"+(c.length-count));
	}
}


	}
}
	


