
import java.util.Scanner;


public class pattern3 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int row,col,val;
		row=1;
		val=1;
		while(row<=n)
		{
			col=1;
			while(col<=row)
			{
			if(col==1 || col==row)
			{
				System.out.print(" "+val+" ");
			}
			else
			{
				System.out.print(" 0 ");
			}
			col++;
			}
			System.out.println();
			row=row+1;
			val++;
		}
		
	}

}
