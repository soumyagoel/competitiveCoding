package june7;

import java.util.Scanner;




public class pattern1 {
	public static void main(String[] args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scn.nextInt();
	int row=1,nsp,nst,cst,csp;
	nsp=1;
	nst=n/2+1;
	while(row<=n)
	{
		 cst=1;
		while(cst<=nst)
		{
			System.out.print("*");
			cst=cst+1;
		}
		 csp=1;
		while(csp<=nsp)
		{
			System.out.print(" ");
			csp=csp+1;
		}
		cst=1;
		while(cst<=nst)
		{
			System.out.print("*");
			cst=cst+1;
		}
		if(row<=n/2)
		{
	nsp=nsp+2;
	nst=nst-1;
	}
	else
	{
		nsp=nsp-2;
		nst=nst+1;
	}
	System.out.println();
	row=row+1;
}
}
	
}
