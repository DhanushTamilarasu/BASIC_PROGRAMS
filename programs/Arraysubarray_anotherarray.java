package madhu;
import java.util.*;
public class Arraysubarray_anotherarray {

	public static void main(String[] args) {
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println(" size a  value");
		int n1=s.nextInt();
       
		System.out.println("size of b value");
        int n2=s.nextInt();
        int a[]=new int[n1];
        int b[]=new int[n2];

		System.out.println("array a  value");
       
        for(i=0;i<n1;i++)
        {
        a[i]=s.nextInt();
        }
		System.out.println("array b  value");

        for( j=0;j<n2;j++)
        {
        	b[j]=s.nextInt();
        }
        int count=0;
        
        for( i=0;i<n1;i++)
        {
        	for(j=1;j<n2;j++)
        	{
        		if(a[i]==b[j])
        			
        		{
        			break;
        			//System.out.println("yes");
        		   
        		}
        		if(i==n1)
            	{ 
                   count=1;
        		System.out.println("no");
                break;
            	}
        	else
        	 {
        		System.out.println("yes");
        		break;
           	 }
        	}
	}
	}
}
