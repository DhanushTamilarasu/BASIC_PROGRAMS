package bmb;
import java.util.Scanner;
public class Arr1clsrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner Sc=new Scanner(System.in);
           System.out.println("enter the size");
           int n=Sc.nextInt();
           int i;
           System.out.println("enter the array");
           int a[]=new int[n];
           for( i=0;i<n;i++)
           {
        	   a[i]=Sc.nextInt();
           }
           for( i=0;i<n;i++) {
        	 for(int j=0;j<n;j++) {
        		 int temp=0;
        		 if(a[i]<=a[j]) {
        		  temp=a[i];
        		  a[i]=a[j];
        		  a[j]=temp;
                  
        		 }

        		 }
         }
           System.out.println("output ");

                         
        	 for(i=0;i<n;i++) {
                	 if(a[i]==a[i+1]) {
                		 continue;
                 }
                     System.out.println("a[i]"+a[i]);

            
                 }

        	 }}
         
	


