package madhu;
import java.util.*;
public class cal_expressionstr {

	public static void main(String[] args) {
             Scanner s=new Scanner(System.in);
             System.out.println("enter str");
             String st=s.next();
             String s1[]=st.split("[+-/*%]");
             char c[]=st.toCharArray();
             int b=Integer.parseInt(s1[0]);
             int m=Integer.parseInt(s1[1]);
             char l=0;
             for(int i=0;i<c.length;i++)
             {
            	 if(c[i]=='+'||c[i]=='-'||c[i]=='/'||c[i]=='*'||c[i]=='%')
            	 {
            		 l=c[i];
            	 }
             }
             switch(l)
             {
             case '+':
            	 System.out.println(b+m);
            	 break;
             case '-':
            	 System.out.println(b-m);
            	 break;

             case '*':
            	 System.out.println(b*m);
            	 break;

             case '/':
            	 System.out.println(b/m);
            	 break;

             case '%':
            	 System.out.println(b%m);
            	 break;

            	 }
             
	}

}
