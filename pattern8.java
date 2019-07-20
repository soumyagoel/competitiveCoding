package june7;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int row,cst,nst,csp,nsp,val;
		row=1;
		nst=1;
		nsp=2*n-3;
		while(row<=n)
		{
			cst=1;
			val=1;
			while(cst<=nst)
			{
				System.out.print(val);
				val++;
				cst++;
			}
			csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			cst=1;
			if(n==row)
			{
				val=val-2;
				cst=2;
			}
			else
			{
				val--;
			}
			while(cst<=nst)
			{
				System.out.print(val);
				val--;
				cst++;
			}
			nsp=nsp-2;
			nst++;
			System.out.println();
			row++;
		}
		
		
	}

}
