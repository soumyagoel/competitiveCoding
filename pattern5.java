
import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
	    System.out.println("enter a number");
	    int n=scn.nextInt();
	    int row,col,val;
	    row=1;
	    while(row<=n)
	    {
	        col=1;
	        while(col<=n-row)
	        {
	        	System.out.print(" ");
	        	col=col+1;
	        }
	        col=1;
	        val=row;
	        while(col<=row)
	        {
	        	System.out.print(val);
	        	val=val+1;
	        	col=col+1;
	        }
	        val=val-2;
	        col=1;
	        while(col<=row-1)
	        {
	        	System.out.print(val);
	        	val=val-1;
	        	col=col+1;
	        }
	        System.out.println();
	        row=row+1;
	    }
	}

}
