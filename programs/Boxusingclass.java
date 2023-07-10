package madhu;
import java.util.*;
public class Boxusingclass {
    public  double volume(int width,int height, double depth)
     {
    	 double v = width*height*depth;
		return v;
     }
     public static void main(String args[])
     {
    	 Scanner s=new Scanner(System.in);
    	 System.out.println(" width");
    	 int w=s.nextInt();
    	 System.out.println("heigth");
    	 int h=s.nextInt();
    	 System.out.println("depth");
    	 double d=s.nextInt();
    	 Boxusingclass myobj=new Boxusingclass();
    	System.out.println( myobj.volume(w,h,d));
    	 }
}
