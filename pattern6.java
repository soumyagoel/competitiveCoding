package june7;

import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int row,nst,cst,nsp,csp,val;
		row=1;
		nst=1;
		nsp=2*n-3;
		val=1;
		while(row<=n)
		{
			cst=1;
			while(cst<=nst)
			{
				System.out.print(val);
				val=val+1;
				cst=cst+1;
				
			}
			csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp=csp+1;
			}
			if(row==n)
			{
				cst=2;
				val=val-1;
			}
			else
				cst=1;
			while(cst<=nst)
			{
				val=val-1;
				System.out.print(val);
				cst=cst+1;
			}
			System.out.println();
			row=row+1;
		}
		
	}

}
