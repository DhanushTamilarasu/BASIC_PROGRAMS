package madhu;
import java.util.*;
public class Strreverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
	String  s=sc.nextLine();
	     String b[]=s.split(" ");
	     int n=b.length;
	     for(int i=n-1;i>=0;i--)
	     {
	        System.out.print("  "+b[i]);
	     }
	}
}