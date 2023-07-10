package madhu;
import java.util.*;
public class namesasc {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the  no.of.names");
	    int   n=sc.nextInt();
	    System.out.println("enter the names");
	    String arr[]=new String[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextLine();
	    	System.out.println(arr[i]);
	    }
	    Arrays.sort(arr,0,n);
	    	System.out.println(Arrays.toString(arr));
	}}    