package bmb;

import java.util.Scanner;

public class Decimalbin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner Sc=new Scanner(System.in);
          System.out.println("enter the num");

          int n=Sc.nextInt();
          String Str="";
          //int sum=0;
          while(n!=0)
          {
        	 int r=n%2;
        	  Str=r+Str;
        	 //sum=sum+r;
        	 n/=2;
          }
          System.out.println(Str+"");
	}

}


