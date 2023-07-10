package madhu;

public class mett {
 public static void main(String args[])
 {
	 int input1=-545;
	 int r;
	 int sum=0;
	 while(input1!=0)
	 {
		 r=input1%10;
		 sum+=r;
		 input1/=10;
		 
	 }
	 if(sum>9||sum<-9)
	 {
		 int b=sum;
		 sum=0;
		 while(b!=0)
		 {
			 int m=b%10;
			 sum+=m;
			 b/=10;
		 }
	 }
	 
	 
	 
	 
	 System.out.println(sum);
	 
	 
	 
	 
	 
	 
	 
}
}
