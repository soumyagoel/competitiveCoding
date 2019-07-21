package june9;

import java.util.Scanner;

public class p5 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int sb=scn.nextInt();
		int db=scn.nextInt();
		int rem,pow,a;
		a=0;
		pow=1;
		while(n!=0)
		{
			rem=n%db;
			n=n/db;
			a=a+rem*pow;
			pow=sb*pow;
		}
		System.out.println(a);
	}

}

