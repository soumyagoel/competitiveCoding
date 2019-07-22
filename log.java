package june12;

import java.util.Scanner;

public class func1 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		System.out.println("enter another number");
		int x=scn.nextInt();
		log( x, n);
	}
		public static int power(int x,int n)
		{
			int pow=1;
			int count=0;
			while(pow<n)
			{
				pow=x*pow;
				count++;
			}
			return(count);
		}
		public static int log(int x, int n)
		{
			int pow=power( x, n);
		System.out.println("log is " + pow);

			return 0;
		}

}
