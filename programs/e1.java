package madhu;
import java.util.Scanner;
public class e1 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the array size");
			int n=sc.nextInt();
			int a[]=new int[n];
			int sum=0,sum1=0;
			for (int i = 0; i < a.length; i++) {
				a[i]=sc.nextInt();
				if(n%2!=0) {
				if(i<n/2)
					sum+=a[i];
				else if(i>n/2)
					sum1+=a[i];
				}
				else {
					if(i<n/2)
						sum+=a[i];
					else if(i>=n/2)
						sum1+=a[i];
					
				}
			}
			System.out.println(sum+"  "+sum1);
			
		}

	}


