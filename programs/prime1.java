package madhu;
import java.util.*;
public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner s=new Scanner(System.in);
       System.out.println("elem");
       int n=s.nextInt();
       int flag=0;
       for(int i=2;i<n;i++)
       {
    	   if(n%i==0)
    	   {
    		   flag++;
              break;
    	   }
    	   else
    	   {
    		   flag=0;
    	   }
    	   
    	   if(flag==0)
    	   {    		
    		   System.out.println("  prime");
               
    	   }
    	   else
    	   {
    		   System.out.println(" not  prime");

    	   }
       }
	}

}
