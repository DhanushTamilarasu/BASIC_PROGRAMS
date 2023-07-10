package madhu;
import java.util.Scanner;
public class firstlastchar
	{
	    public static void main(String[] args)
	    {
	          Scanner sc=new Scanner(System.in);
	          Scanner b=new Scanner(System.in);
	          System.out.println("size:");
	          int n=sc.nextInt();
	          String s[]=new String[n];
	          System.out.println("values:");
	          int i;
	          char c1=' ',c2=' ';
	          String s1[]=new String[20];
	          for(i=0;i<n;i++)
	          {
	            s[i]=b.nextLine();
	          }
	          System.out.println("target value:");
	          String s2=b.nextLine();
	          for(i=0;i<s2.length();i++)
	          {
	             char c= s2.charAt(i);
	              c1=s2.charAt(0);
	             
	              c2=s2.charAt(s2.length()-1);
	             
	          }
	          System.out.println(c1);
	          System.out.println(c2);
	          for(i=0;i<n;i++)
	          {
	            if(s[i].charAt(0)==c1&&s[i].charAt(s2.length()-1)==c2)
	            {
	                 s1[i]=s[i];
	                 System.out.println(s1[i]);

	            }
	          }


	          

	    }

		