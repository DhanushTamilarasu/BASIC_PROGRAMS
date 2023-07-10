package madhu;
import java.util.*;
public class secstrreverse {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	        System.out.println("str1");
	        String s1=s.nextLine();
	        System.out.println("str2");
	        String s2=s.nextLine();
           StringBuilder sb =new StringBuilder(s2);
           sb=sb.reverse();
           System.out.println(s1+sb);
          
           
		}

	}
