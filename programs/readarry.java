package bmb;
import java.util.*;
public class readarry {
	public static void main(String[]args)
	{
	 Scanner Sc=new Scanner(System.in);
     System.out.println("enter the no.of size");
     int r=Sc.nextInt(); 
     System.out.println("enter the no.of.column");
     int c=Sc.nextInt();
     int a[][]=new int[r][c];
     //int b[][]=new int[r][c];
     //int m[][]=new int[r][c];
     System.out.println(" array");

     for(int i=0;i<r;i++)
     {
  	   for(int j=0;j<c;j++) 
  	   {
  		   a[i][j]=Sc.nextInt();
  		   
  		   }
        // System.out.println("column of array");
  	   System.out.println("");
     }
     for(int i=0;i<r;i++)
     {
  	   for(int j=0;j<c;j++) 
  	   {
  	  	   System.out.println(" "+a[i][j]);

  	   }
     }}
}