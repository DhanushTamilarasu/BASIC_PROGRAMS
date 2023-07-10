package madhu;
import java.util.*;
public class uppertrinagle {
	public static void main(String[] args)
    {
        int row=0, col=0,i=0,j=0;
        int a[][];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ROW OF MATRIX");
        row=sc.nextInt();
        System.out.println("ENTER THE COLUMN OF MATRIX");
        col=sc.nextInt();

        if(row!=col)
        {
            System.out.println("MATRIX NEED TO BE SQUARE MATRIX FIRST!!!");
        }

        else
        {
            a=new int[row][col];
            System.out.println("ENTER THE ELEMENTS IN MATRIX");
            for(i=0;i< row;i++)
            {
                for(j=0;j< col;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }



            System.out.println("UPPER TRIANGULAR MATRIX");
            for(i=0;i< row;i++)
            {
                for(j=0;j< col;j++)
                {
                    if(i > j)
                    {
                        System.out.print("0 ");

                    }
                    else
                    {
                        System.out.print(a[i][j]+" ");
                    }

                }
                System.out.println();
            }

        }

    }
}
