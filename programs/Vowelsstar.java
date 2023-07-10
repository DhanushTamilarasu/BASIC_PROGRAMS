package bmb;
import java.util.*;
public class Vowelsstar {
       public static void main(String args[]) {
    	   Scanner s=new Scanner(System.in);
    	   System.out.println("enter the char");
    	   String st=s.nextLine();
    	   char ch[]=st.toCharArray();
    	   for(int i=0;i<st.length();i++)
    	   {
    		   if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
    		   {
    			   ch[i]='*';
    		   }
        	   System.out.println(ch[i]);
    	   
       }
}
       
}
