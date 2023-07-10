package madhu;
import java.util.*;
public class first_nonrepcharacter {

	public static void main(String[] args) {
        int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elem");
		String st=s.next();
		char c[]=st.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			count=0;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
				if(count==0)
				{
					System.out.println(c[i]);
					break;
				}
				
			}
		}
		
	}


