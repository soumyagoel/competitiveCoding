package june7;

import java.util.Scanner;


public class fib {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=scn.nextInt();
		int a,b,c;
		a=0;
		b=1;
		c=1;
		System.out.println(a);
		while(c<n)
		{
		System.out.println(c);
		c=a+b;
		a=b;
		b=c;
		
		}
	}

}
