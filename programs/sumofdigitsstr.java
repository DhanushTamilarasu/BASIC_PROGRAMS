package madhu;

import java.util.Scanner;

public class sumofdigitsstr {

	public static void main(String args[])
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("values");
		String st=s.nextLine();
		int b=0;
		//char c[]=st.toCharArray();
		
		for(int i=0;i<st.length();i++)
		{ 
			char a=st.charAt(i);
			if(Character.isDigit(a))
			b=Integer.parseInt(String.valueOf(a));
		sum=sum+b;
		}
	
	
		System.out.println(" sum of digits  "+sum);
}
}

