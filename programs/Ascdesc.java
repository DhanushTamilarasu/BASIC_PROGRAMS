package bmb;
import java.util.*;
public class Ascdesc {
           public static void main(String args[])
           {
        	   Scanner s=new Scanner(System.in);
        	   System.out.println("array size");
        	   int n=s.nextInt();
        	   int a[]=new int[n];
 			  System.out.println("arr:");
                  int i,j;
        	   for(i=0;i<n;i++)
        	   {
        		   a[i]=s.nextInt();
        	   }
        	   for(i=0;i<n;i++)
        	   {
        		   for(j=i+1;j<n;j++) {
        			   if(a[i]>a[j]) {
        			    int temp=a[i];
        			   a[i]=a[j];
        			   a[j]=temp;
        		   }
        		   }
        	   }
 		for(i=0;i<n;i++) {
 			System.out.println("the asending: "+a[i]);
 			
 		}



      
        	   
           }
}
