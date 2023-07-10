package bmb;
import java.util.*;
public class Factrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner Sc=new Scanner(System.in);
          System.out.println("number");
          int n=Sc.nextInt();
          int fact;
          int factorial=fact(n);
          System.out.println(" fact number"+factorial);
	}
	static int fact(int n)
	{
		int facto;
		if(n==1) {
			return 1;
		}
		facto=fact(n-1)*n;
		return facto;

          
	}

}
