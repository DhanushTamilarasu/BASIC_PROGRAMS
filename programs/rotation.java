package madhu;
import java.util.*;
public class rotation {
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
	    System.out.println("enter string1");
	    String s1=s.nextLine();
	    System.out.println("enter string2");
	    String s2=s.nextLine();
	    if(s1.length()!=s2.length())
	    {
	    	System.out.println("is not rotation");
	    	System.exit(0);
	    	//break;
	    }
	    String s3=s1+s1;
	   
	    if(s1.indexOf(s3)!=0)
	    {
	    	System.out.println("rotation \t"+s2);
	    }
	    else
	    {
	    	System.out.println("not rotation");
	    }
	
}
}
