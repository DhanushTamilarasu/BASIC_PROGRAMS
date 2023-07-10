package madhu;

import java.util.Scanner;

public class Spacepreserving {
	public  static void main(String args[])
	    {
		Scanner s=new Scanner(System.in);
	   System.out.println("elem");
	   String st=s.nextLine();
	        char c[] = st.toCharArray();
	        char a[] = new char[c.length];
	 
	        for (int i = 0; i <c.length; i++) {
	            if (c[i] == ' ') {
	                a[i] = ' ';
	            }
	        }
	 
	
	        int j = a.length - 1;
	        for (int i = 0; i < a.length; i++) {
	 
	            if (c[i] != ' ') {
	 
	                if (a[j] == ' ') {
	                    j--;
	                }
	                a[j] = c[i];
	                j--;
	            }
	        }
	        System.out.println(a);
	    }
	 
	    
}
