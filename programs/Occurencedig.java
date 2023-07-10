package bmb;
import java.util.*;

public class Occurencedig {
	public static void main(String args[]) {
	 	   Scanner s=new Scanner(System.in);
	 	   System.out.println("enter the char");
	 	   String st=s.nextLine();
	 	   int count=1;
	 	  
	 	   char[] ch=st.toCharArray();
	 	   for(int i=0;i<ch.length;i++) {
	 		   
	 		   for(int j=i+1;j<ch.length;j++) {
	 			   if(ch[i]==ch[j]) 
	 				   count++;
	 		   }
	 	   }
	 				   System.out.println(count);
	 			   

	 	   
	}
}
