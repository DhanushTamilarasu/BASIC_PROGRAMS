package madhu;
import java.util.*;
public class Stock {
	String name="pen";
	String symbol="*";
	double clp=40;
	double cclp=20;
	public void getChangePercentage()
	{
		double b=clp-cclp;
		double m=clp+cclp;
		double l=(b/m)*100;
		System.out.println(""+l);
	}
	public static void main(String args[])
	{
		Stock myobj=new Stock();
		myobj.getChangePercentage();
	}

}
