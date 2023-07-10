package bmb;
import java.util.*;
public class Strequals {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char ch[]=s1.toCharArray();
		String s2=s.nextLine();
		char ch1[]=s2.toCharArray();
int count=0;
		for(int i=0;i<ch.length;i++) {
			count=0;
			for(int j=0;j<ch1.length;j++) {
				if(ch[i]==ch1[j]) {
//					System.out.println("equals");
                  count++;
				}
			}
		}
			if(count!=0) {
				System.out.println("equals");

			}
			else
			{
				System.out.println("not equals");

			
			
			
		}
	}

}
