package madhu;
import java.util.*;
public class transposematrix {
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter row");
	   int r=s.nextInt();
	   System.out.println("enter column");
	   int c=s.nextInt();
	   int a[][]=new int[r][c];
	   for(int i=0;i<r;i++)
	   {
		   for(int j=0;j<c;j++)
		   {
			   a[i][j]=s.nextInt();
		   }
		   System.out.println("");

		   }
	   System.out.println(" after tranpose matrix");

   for(int i=0;i<c;i++)
   {
	   for(int j=0;j<r;j++)
	   {
		   System.out.print(" "+a[j][i]);
		  
	   }	  
   
	   System.out.println("");
   }
	   
   
}
}
