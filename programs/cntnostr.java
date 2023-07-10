package madhu;
import java.util.Scanner;

public class cntnostr {
		public static void main(String []args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter str");
			String st=s.nextLine();
			char c[]=st.toCharArray();
			int sum=0;
			int count=0;
			for(int i=0;i<c.length;i++)
			{
				if(Character.isDigit(c[i]))
				{
					if(i==c.length-1)
					{
	                  count++;
	                 }
					sum=sum+c[i];
				}
				else
				{
					if(sum!=0) {
						count++;
						sum=0;
					}
					continue;
				}
			}
			System.out.println(count);
		}
		
		

	}



