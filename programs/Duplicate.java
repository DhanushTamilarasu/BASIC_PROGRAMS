package bmb;
import java.util.*;
public class Duplicate {

	public static void main(String args[]) {
 	   Scanner s=new Scanner(System.in);
 	   System.out.println("enter the char");
 	   String st=s.nextLine();
 	   char[] ch=st.toCharArray();
 	   for(int i=0;i<st.length();i++) {
 	 	   int count=0;

 		   for(int j=i+1;j<st.length();j++) {
 			   if(ch[i]==ch[j]) {
 			 	   //System.out.println(""+ch[i]);
 			 	  count++;
 			 	  break;
 			 	  }  }
 		   if(count==1) {
 		    	   System.out.println(""+ch[i]);

 		   }
}}
}
