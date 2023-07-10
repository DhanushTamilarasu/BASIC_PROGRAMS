package madhu;
import java.util.*;
public class count_stringcontains {
	public static void main(String args[])
	{
		   Scanner sc=new Scanner(System.in);
           Scanner z=new Scanner(System.in);
           System.out.println("Size:");
           int n=sc.nextInt();
           System.out.println("words:");
           String w[]=new String[n];
           int i,count=1;
           for(i=0;i<n;i++)
           {
           	w[i]=z.nextLine();
           }
           System.out.println("String:");
           String s=z.nextLine();
           for(i=0;i<n;i++)
           {count=1;
           	if(s.contains(w[i]))
           	{		count++;
           	break;
           }
           	else
           	{
           		count=0;
           	}
           }
           if(count>0)
           {
           	System.out.println("matching words are:"+count);
           }
	}



}