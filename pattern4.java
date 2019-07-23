
import java.util.Scanner;


public class pattern4 {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int row,col,val;
		row=1;
		val=1;
		while(row<=n)
		{col=1;
			while(col<=row)
			{
				System.out.print(val);
				col=col+1;
			}
			System.out.println();
			row=row+1;
		}
	}

}
