package madhu;
import java.util.*;
public class remove_alpha {

	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          System.out.println("enter the str");
          String st=s.nextLine();
          String s1=st.replaceAll( "[abcdefghijklmnopqrsuvwxyz]","");
           System.out.println(""+s1);
	}

}
