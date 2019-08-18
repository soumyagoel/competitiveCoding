package june21;

import java.util.Scanner;

public class triadd {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		int n=scn.nextInt();
//		tri(n);
//		int b=tri(n);
		int b=tri(n);
		System.out.println(b);

	}
	public static int tri(int n)
	{
		int a;
		if(n==0)
		{
			return 0;
//			return;
		}
		 a=n+tri(n-1);
//	    a=a+n;
//	    tri(a,n-1);
	  
//	    System.out.print(a);
		return a;
	}

}
