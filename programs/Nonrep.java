package bmb;

import java.util.Scanner;

public class Nonrep {
  public static void main(String args[]) {
	 	   Scanner s=new Scanner(System.in);
	 	   System.out.println("enter the char");
	 	   String st=s.nextLine();
	 	  
	 	   char[] ch=st.toCharArray();
	 	   for(int i=0;i<ch.length;i++) {
	 		  int count=0;
	 		   for(int j=0;j<ch.length;j++) {
	 			   if(ch[i]==ch[j]) {
	 			 	   count++;
	 			 	  }  }
	 		   if(count==1) {
				 	   System.out.println(""+ch[i]);

	 		   }
	}
	

}
}