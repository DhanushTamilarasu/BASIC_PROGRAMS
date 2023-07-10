package madhu;
import java.util.*;
public class Floydschar {
         public static void main(String args[])
         {
        	 Scanner Sc=new Scanner(System.in);
   		  System.out.println("enter rows");
   		  int n=Sc.nextInt();
   		 // String s=Sc.nextLine();
   		  char c=Sc.next().charAt(0);
   		  for(int i=1;i<=n;i++)
   		  {
   			  for(int j=0;j<i;j++)
   		  {
   			  System.out.print(c+" ");
             }
   			  System.out.println();
   			  c++;
         }
}
}
