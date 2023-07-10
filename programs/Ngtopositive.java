package bmb;
import java.util.Scanner;
public class Ngtopositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner i=new Scanner(System.in);
        System.out.println(" enter the number");

        int n=i.nextInt();
        if(n<0)
        {
        	int positive=Math.abs(n);
            System.out.println("number:"+positive);

        }
	}

}
