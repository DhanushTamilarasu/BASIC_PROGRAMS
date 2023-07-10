package bmb;
import java.util.*;
public class Age {
	public static void main(String args[])
	{
		Scanner i =new Scanner(System.in);
		System.out.println("enter the date");
		int d1=i.nextInt();
		System.out.println("enter the month");
		int m1=i.nextInt();
		System.out.println("enter the year");
		int y1=i.nextInt();
		System.out.println("enter the  current date");
		int d2=i.nextInt();
		System.out.println("enter the current month");
		int m2=i.nextInt();
		System.out.println("enter the current year");
        int y2=i.nextInt();
        if(d2<d1) {
        	m2=m2-1;
        	d2=d2+30;
        System.out.println(""+(d2-d1));
        }
        else
        {
    		System.out.println(""+(d2-d1));

        	  }
        if(m2<m1)
        {
        	y2=y2-1;
        	m2=m2+12;
    		System.out.println(""+(m2-m1));

        }
        else
        {
    		System.out.println(""+(m2-m1));

        }
		System.out.println(""+(y2-y1));





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
