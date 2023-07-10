package bmb;
import java.util.*;
public class Onescls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i =new Scanner(System.in);
		System.out.println("enter the inpu1");
		int inp1=i.nextInt();
		System.out.println("enter the inpu2");
		int inp2=i.nextInt();
		System.out.println("enter the inpu3");
		int inp3=i.nextInt();
		System.out.println("enter the  inpu4");
		int inp4=i.nextInt();
		if(inp4==0) {
			inp1=inp1%10;
			inp2=inp2%10;
			inp3=inp3%10;
			 int a=inp1+inp2+inp3;
	System.out.println(""+a);
		}
		else if(inp4==1) {
			if(inp1<10) {
				inp1=1;
			}
			else
			{
				inp1=inp1%100;
				inp1/=10;
			}
			if(inp2<10)
			{
				inp2=1;
			}
			else
			{
				inp2=inp2%100;
				inp2/=10;
			}
			if(inp3<10)
			{
				inp3=1;
			}
			else
			{
				inp3=inp3%100;
				inp3/=10;
			}
			int a=inp1+inp2+inp3;
			System.out.println("ones value:"+a);
		
}
		else
		{
			if(inp1<100) {
				inp1=2;
			}
			else {
				inp1=inp1/100;
			}
			if(inp2<100)
			{
				inp2=2;
			}
			else
			{
				inp2=inp2/100;
			}
			if(inp3<100)
			{
				inp3=2;
				
			}
			else
			{
				inp3=inp3/100;
			}
			int a=inp1+inp2+inp3;
			System.out.println("hunders values"+a);
		}
	}
}
	
	
	
