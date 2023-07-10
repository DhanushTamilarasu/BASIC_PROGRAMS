package bmb;
import java.util.*;
public class Logicprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String d="123ssdf4@";
            String f="";
            char s[]=d.toCharArray();
            for(int i=0;i<s.length;i++)
            {
            	if(Character.isAlphabetic(s[i]))
            	{
            		System.out.println("alpha : "+s[i]);
            		f+=String.valueOf (Character. isUpperCase(d.charAt(i)));
              // System.out.println("fff :"+f);          
            	}
            	    else if(Character.isDigit(s[i])) {
                    System.out.println("num :"+s[i]);          		

            	}
            
                  else 
            {
                System.out.println("special symb : "+s[i]);          		

            }
	}

	}}
