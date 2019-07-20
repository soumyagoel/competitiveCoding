package june7;

import java.util.Scanner;


public class pattern {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int row=1,nsp,nst=1;
		nsp=n/2;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp=csp+1;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst=cst+1;
			}
			if(row<=n/2)
			{
				nst=nst+2;
				nsp=nsp-1;
			}
			else
			{
				nst=nst-2;
				nsp=nsp+1;
			}
			System.out.println();
			row=row+1;
		}
	}

}
