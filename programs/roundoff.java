package madhu;
import java.util.*;
public class roundoff {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		double  n=s.nextDouble();
		System.out.println("enter the  decimal number");
        int n1=s.nextInt();
        double round=Math.round(n*Math.pow(10,n1))/Math.pow(10, n1);
		System.out.println(round);

	}

}
