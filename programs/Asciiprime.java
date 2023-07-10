package madhu;
import java.util.*;
public class Asciiprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner s=new Scanner(System.in);
             System.out.println("enter the string names");
             String st=s.nextLine();
             int a[]=new int[20];
             int flag=0;
             for(int i=0;i<st.length();i++)
             {
                char c=st.charAt(i);
                a[i]=c;
                System.out.println(a[i]);
             
             }
         for(int i=0;i<a.length;i++)
         {flag=0;
        	 for(int j=2;j<=a.length/2;j++)
        	 {
        		 if(a[i]%j==0)
        		 { 
        			 flag=1;
        			 break;
        		 }
        		 else
        		 {
        			 flag=0;
        			 
        		 }
        	 }
        		 if(flag==0)
        		 {
        			 System.out.println("prime : "+a[i]);
        		 }
        	 }
        		 
         

}
}
