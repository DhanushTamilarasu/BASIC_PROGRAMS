package madhu;

import java.util.Arrays;
import java.util.Scanner;

public class dumm {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("size");
    int  n = sc.nextInt();
    String[] arr = new String[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextLine();
    }
    //System.out.println(Arrays.toString(arr));
    Arrays.sort(arr,0,n);
    for(String i: arr){
        System.out.print(i+" asc");
    }
}
}
