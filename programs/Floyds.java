package bmb;
import java.util.*;
public class Floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner Sc=new Scanner(System.in);
		  System.out.println("enter rows");

          int n=Sc.nextInt();
          int b=1;
          for(int i=0;i<n;i++)
          {
        	  for(int j=0;j<=i;j++)
        	  {
        		  System.out.print(" "+(b++));
        	  }
    		  System.out.println();

          }
	}

}
