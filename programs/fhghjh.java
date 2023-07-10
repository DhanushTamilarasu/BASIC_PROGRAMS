package madhu;
import java.util.Scanner;
public class fhghjh
{
public void  complex(double r,double img,double r1,double img1)
{
	double b=r+r1;
	double m=img+img1;
	System.out.println(b);
	System.out.println(m);
	}
public static void main(String args[])
 {
	Scanner s=new Scanner(System.in);
	System.out.println("enter real no");
	double r=s.nextDouble();
	System.out.println("enter img no");
	double img=s.nextDouble();
	System.out.println("enter real1 no");
	double r1=s.nextDouble();
	System.out.println("enter img1 no");
	double img1=s.nextDouble();
	fhghjh myobj=new fhghjh();
	
	myobj.complex(r, img, r1, img1);

 }
}
