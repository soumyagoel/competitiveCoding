
import java.util.Scanner;


public class pattern2 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int nst,nsp,cst,csp,row,val;
		row=1;
		nsp=n-1;
		nst=1;
		while(row<=2*n-1)
		{
			csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp=csp+1;
			}
			cst=1;
			val=1;
			while(cst<=nst)
			{
				System.out.print(val);
				cst=cst+1;
			}
			while(val==row)
			{
				System.out.println(val);
				val=val+1;
			}
			if(row<n)
			{
				nsp=nsp-1;
				nst=nst+2;
			}
			else
			{
				nsp=nsp+1;
				nst=nst-2;
			}
			System.out.println();
			row=row+1;
		}
		
	}

}
