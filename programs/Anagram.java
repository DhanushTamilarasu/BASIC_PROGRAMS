package bmb;
import java.util.*;
public class Anagram {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char ch[]=s1.toCharArray();
		String s2=s.nextLine();
		char ch1[]=s2.toCharArray();
		int i,j;
		int n=s1.length();
		int n1=s2.length();
		if(n!=n1)
		{
             System.out.println("not an anagram");

		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
                if(ch[i]>ch[j])
                {
                	char temp=ch[i];
                	ch[i]=ch[j];
                	ch[j]=temp;
                	
                }
                if(ch1[i]>ch1[j]) {
                	char temp=ch1[i];
                	ch1[i]=ch1[j];
                	ch1[j]=temp;
                }
			}
		}
		for(i=0;i<n;i++) {
			if(ch[i]!=ch1[i])
			{
	             System.out.println("not a anagram");
	            break;  

			}
			else
			{
	             System.out.println("anagram");
	             break;

			}
			
		}
	}

}
