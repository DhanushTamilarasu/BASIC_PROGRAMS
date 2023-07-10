package madhu;
import java.util.*;
public class wifipin{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner st=new Scanner(System.in);
		System.out.println("room no:");
		 
       int t=sc.nextInt();
       int u=t/10%10;
       int th=0;
       System.out.println("guest name:");
       String s=st.nextLine();
       int y=s.length();
       char c=s.charAt(y-1);
       int n=t%10;
       char e;
       if(n==1)
       {
    	  e='!';
       //System.out.println("h:"+e);
       
	}
       else if(n==2)
       {
    	   e='@';
           //System.out.println("h"+e);
       }
       else if(n==3)
       {
    	   e='#';
           //System.out.println("h:"+e);
       }
       else if(n==4)
       {
    	   e='$';
           //System.out.println("h:"+e);
       }
       else if(n==5)
       {
    	   e='%';
           //System.out.println("h"+e);
       }
       else if(n==6)
       {
    	   e='^';
           //System.out.println("h:"+e);
       }
       else if(n==7)
       {
    	   e='&';
           //System.out.println("h"+e);
       }
       else if(n==8)
       {
    	   e='*';
           //System.out.println("h:"+e);
       }
       else if(n==9)
       {
    	   e='(';
           //System.out.println("h:"+e);
       }
       else 
       {
    	   e=')';
           //System.out.println("h:"+e);
       }
       int sum = 0;
       
       while (t > 0 || sum > 9)
       {
           if (t == 0) {
               t = sum;
               sum = 0;
           }
           sum += t % 10;
           t /= 10;
       }
       //System.out.println(sum);
       if(sum%2==0)
       {
    	    th=sum;
    	 //  System.out.println(th);
       }
       else if(sum%2!=0)
       {
    	    th=sum+1;
    	   //System.out.println(th);
       }
       else if(sum==0)
       {
    	    th=sum+2;
       
       //System.out.println(th);  
       }
	String z="";
	String x=String.valueOf(u);
	String j=String.valueOf(th);
	String v=String.valueOf(e);
    z+=j+e+c+u;
      System.out.print("wifi pin :"+z);
}
}
