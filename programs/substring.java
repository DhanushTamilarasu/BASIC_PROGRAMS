package madhu;
import java.util.*;
public class substring {
           public static void main(String args[])
           {
        	   Scanner sc=new Scanner(System.in);
        	   System.out.println("enter the string");
        	   String s=sc.nextLine();
        	   for(int i=0;i<s.length();i++) {
        		   int j=i+2;
        	  if(j>s.length())
        	  {
        		  j=s.length()-1;
        		  }
        	  String b=s.substring(i,j);
        	  System.out.println(b);
        	   }
           }
}
        	  