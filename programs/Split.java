package bmb;
import java.util.*;
public class Split{
	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=Sc.nextLine();
		String[]word=s.split("\\s+");
		for(String w:word)
		{
			System.out.println(w);
		}
	}}