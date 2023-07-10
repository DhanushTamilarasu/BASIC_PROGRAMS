package madhu;
import java.util.*;
public class charpattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner Sc=new Scanner(System.in);
		  System.out.println("enter rows");
		  int n=Sc.nextInt();
		  String s=Sc.nextLine();
		  char c='A';
		  for(int i=0;i<=n;i++)
		  {
			  for(int j=0;j<i;j++)
		  {
			  System.out.print(" "+(c++));
          }
			  System.out.println();
	}

}
}
    

