package bmb;
import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,m;
        System.out.println("enter rows and col");
		   Scanner Sc=new Scanner(System.in);
           int r=Sc.nextInt(); 
           int c=Sc.nextInt();
           int a[][]=new int[r][c];
           System.out.println(" matrix");

           for(int i=0;i<r;i++)
           {
        	   for(int j=0;j<c;j++) 
        	   {
        		   a[i][j]=Sc.nextInt();
        		   
        		   }
              System.out.println(" ");
           }
        	   System.out.println("after transpose");

        	   
        	   for(int i=0;i<r;i++)
   	         {
   	    	   for(int j=0;j<c;j++)
   	    	   {
   	    		   System.out.print(a[j][i]+" ");
   	    	   }
   	    	   System.out.println(" ");
      }

}}
