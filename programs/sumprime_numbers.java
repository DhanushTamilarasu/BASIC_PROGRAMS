package madhu;
import java.util.*;
public class sumprime_numbers {
	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          System.out.println("enter the num upto");
          int n=s.nextInt();
         System.out.println("elem");
         int flag=0;
         int sum=0;
         int j=0;
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
        	 a[i]=s.nextInt();
         }
         
          for(int i=0;i<n;i++)
          {
        	  flag=0;
        	  for( j=2;j<i;j++)
        	  {
        		  if(a[i]%j==0)
        		  {
        			  flag++;
                       break;
        		  }
        	 
        	  } 
        	  if(a[i]!=1&&flag==0 )
        	  {
        		 sum+=a[i]; 
        	  }
          }
  		System.out.println(" "+sum);

          }
	
}


