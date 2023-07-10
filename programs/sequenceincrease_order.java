package madhu;
import java.util.*;
public class sequenceincrease_order {

	public static void main(String[] args) {
              Scanner s=new Scanner(System.in);
              System.out.println("enter number size");
              int n=s.nextInt();
              System.out.println("enter number ");
              int a[]=new int[n];
        	  int count=0;
        	for(int i=0;i<n;i++)
              {
            	  a[i]=s.nextInt();
              }
              for(int i=0;i<n-1;i++)
              {  
            	  count=0;
            	  if(a[i]>=a[i+1])
            	  {
                      count++;		 
                      break;
            	  }
            	  else
            	  {
            		  count=0;

            	  }
              }
            	  
              if(count==0)
              {
            	  System.out.println("true");

              }
              else
              {
            	  System.out.println("false");
              }
	}

}
