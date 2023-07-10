package madhu;
import java.util.*;
public class nextalphabets {
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("enter string");
       String st=s.nextLine();
       char c[]=st.toCharArray();
       for(int i=0;i<c.length;i++)
       {
    	 if(!Character.isAlphabetic(c[i]))
    	   {
    		System.out.println(c[i]);   
    	   }
    	 else
    	 {
    		 c[i]+=1;
    		 if(c[i]=='a'||c[i]=='e'||c[i]=='o'||c[i]=='i'||c[i]=='u')
    		 {
    			 String b=String.valueOf(c[i]);
    			 b=b.toUpperCase();
    	    		System.out.println(b);   

    		 }
    		 else
    		 {
    	    		System.out.println(c[i]);   

    		 }
    	 }
       }
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
