package madhu;

import java.util.Scanner;

public class substringstr {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String st=s.nextLine();
	System.out.println("enter value");
	int k=s.nextInt();
	int r=0;
	int j=0;
	j=k;
	for(int i=0;i<st.length();i++) {
		if(j>st.length())
		{
			break;
		}
	String substring=st.substring(r, j);
	System.out.println(substring);
	r=j;
	j+=k;
	}
	}
}



