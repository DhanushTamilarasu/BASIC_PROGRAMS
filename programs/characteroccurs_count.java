package madhu;
import java.util.*;
public class characteroccurs_count {

	public static void main(String[] args) {
		    int count=0;
            Scanner s=new Scanner(System.in);
           System.out.println("enter the string");
           String st=s.nextLine();
           char c[]=st.toCharArray();
           for(int i=0;i<c.length;i++)
           {
        	   count=1;
        	   for(int j=i+1;j<c.length;j++)
        	   {
        		   if(c[i]==c[j])
        		   {
        			   count++;
        			   c[j]='0';
        		   }
        		
        	   }
        	   if(c[i]!='0') {
        		            System.out.println(""+c[i]+": "+count);

        	   }
        	   }
	}

}
