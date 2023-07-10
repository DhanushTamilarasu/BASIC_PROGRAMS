package madhu;
import java.util.*;
public class alphabeticposition {
		public static void main(String[] args) {
	           Scanner s=new Scanner(System.in);
	           System.out.println("enter str");
	           String st=s.next();
	           char c[]=st.toCharArray();
	           int sum=0;
	           for(int i=0;i<c.length;i++)
	           {
	        	   if(st.charAt(i)!='a'&&st.charAt(i)!='e'&&st.charAt(i)!='i'&&st.charAt(i)!='o'&&st.charAt(i)!='u')
	        	   {
	        		   if(Character.isAlphabetic(c[i]))
	        		   {
	        			   int ascii=c[i]-96;
	    	    	          System.out.println(ascii);

	    	    	          sum+=ascii;
	        		   }
	        		   }

	    	   }
	           System.out.println("total value:"+sum);

	           

	}

}
