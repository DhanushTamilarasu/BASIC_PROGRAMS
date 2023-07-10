package bmb;
import java.util.*;
public class Palindrome  {   	  
    	  public static void main(String[] args) {
    			String a,b="";
    			Scanner Sc=new Scanner(System.in);
    				a=Sc.nextLine();
    				int n=a.length();
    		        for(int i=n-1;i>=0;i--)
    		        {
    		        	b=b+a.charAt(i);
    		        }
    		        if(a.equals(b))
    		        {
    		        	System.out.println("palin");
    		        }
    		        else
    		        {
    		        	System.out.println("not palin");
    		        }
    	  }
}



    		
    		
