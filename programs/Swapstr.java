package bmb;
import java.util.*;
public class Swapstr {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the st");
		String a=s.nextLine();		
		System.out.println("enter the str ");
		String b=s.nextLine();
		//System.out.println(a);
		a=a+b;
		System.out.println(a);
		b=a.substring(0,a.length()-b.length());
		System.out.println(b);
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(a+""+b);



	}}

	
