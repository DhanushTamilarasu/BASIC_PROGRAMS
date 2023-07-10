package madhu;
	import java.util.Arrays;
	import java.util.Scanner;

	public class tower {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the array size");
			int n=sc.nextInt();
			System.out.println("enter the k value:");
			int k=sc.nextInt();
			int a[]=new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i]=sc.nextInt();
			}int min=0,max=0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]<k)
					a[i]=a[i]+k;
				else
					a[i]=a[i]-k;
				min=a[0];
				if(min>a[i]) 
					min=a[i];
				if(max<a[i])
					max=a[i];
				
			}
			System.out.println("THE MODIFIED ARRAY IS :"+Arrays.toString(a));
			System.out.println("THE DIFFERENCE IS :"+(max-min));
			
		}

	}


