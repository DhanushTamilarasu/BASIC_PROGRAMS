package bmb;
import java.util.*;
public class Integerdigits {
	public static void main(String args[])
	{
		 	   Scanner s=new Scanner(System.in);
		 	   System.out.println("enter the char");
		 	   String st=s.nextLine();
		 	  
		 	   char ch[]=st.toCharArray();
		 	   for(int i=0;i<ch.length;i++) {
		 		  //int count=0;
		 		 if(Character.isDigit(ch[i]))
		 		 {
		 			// System.out.print("");
		 		 
	 			 System.out.print(""+ch[i]);
		 		 }
}
}
}
