package madhu;
import java.util.*;
public class befstarafter {
     public static void main(String args[])
     {
    	 String m="";
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("enter str");
    	 String s1=s.nextLine();
    	 StringBuffer b = new StringBuffer(s1);
    	 int n=s1.length()-1;
    	 for(int i=0;i<n;i++)
    	 {
    		 if(s1.charAt(i)=='*')
    		 {
    			 m=b.delete(i-1,i+2 ).toString();
    		 }
    		 
    	 }
    	 		System.out.println(""+m);
     }
}
