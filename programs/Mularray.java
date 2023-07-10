package bmb;
import java.util.*;
public class Mularray{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
        System.out.println("enter the no.of rows");
        int r=Sc.nextInt(); 
        System.out.println("enter the no.of.column");
        int c=Sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int m[][]=new int[r][c];
        System.out.println("first matrix");

        for(int i=0;i<r;i++)
        {
     	   for(int j=0;j<c;j++) 
     	   {
     		   a[i][j]=Sc.nextInt();
     		   
     		   }
           // System.out.println("column of array");
        }
        System.out.println("sec matrix");

     	   for(int i=0;i<r;i++)
     	   {
     		   for(int j=0;j<c;j++)
     		   {
     			   b[i][j]=Sc.nextInt();
     		   }
     	         // System.out.println("column of array");
     	   }
     	          for(int i=0;i<r;i++)
     	          {
     	        	  for(int j=0;j<c;j++)
     	        	  {
     	        		 m[i][j]=0;
   	        		  for(int l=0;l<c;l++) {

   	        		m[i][j]=m[i][j]+a[i][l]*b[i][j];  
   	        	  }
   	          }
	}
     	        	
     	         
     	         System.out.println("mul matrix");
	
     	       for(int i=0;i<r;i++)
     	         {
     	    	   for(int j=0;j<c;j++)
     	    	   {
     	    		   System.out.print(m[i][j]+" ");
     	    	   }
     	    	   System.out.println(" ");
        }
}

}
